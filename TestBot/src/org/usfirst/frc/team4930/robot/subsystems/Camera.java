package org.usfirst.frc.team4930.robot.subsystems;

import org.opencv.core.Mat;
import org.usfirst.frc.team4930.robot.commands.PutVideo;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Camera extends Subsystem
{
  private CameraServer camServer;

  private UsbCamera usbCam0;
  private UsbCamera usbCam1;
  private CvSink cvSink0;
  private CvSink cvSink1;
  private CvSource cvSource;

  private int camNum = 0;

  public Camera() {
    camServer = CameraServer.getInstance();

    usbCam0 = camServer.startAutomaticCapture("cam0", 0);
    usbCam1 = camServer.startAutomaticCapture("cam1", 1);
    usbCam0.setResolution(100, 100);
    usbCam0.setFPS(30);
    usbCam1.setResolution(100, 100);
    usbCam1.setFPS(30);

    // camServer.addCamera(usbCam0);
    // camServer.addCamera(usbCam1);

    cvSink0 = camServer.getVideo(usbCam0);
    cvSink1 = camServer.getVideo(usbCam1);
    cvSource = camServer.putVideo("Switcher", 100, 100);
    cvSink0.setEnabled(true);
    cvSink1.setEnabled(false);
  }

  public void putVideo() {
    Mat frame = new Mat();
    if (camNum == 0) {
      cvSink0.grabFrame(frame);
    } else if (camNum == 1) {
      cvSink1.grabFrame(frame);
    }
    cvSource.putFrame(frame);
  }

  public void toggleCamera() {
    if (camNum == 0) {
      camNum = 1;
      cvSink0.setEnabled(false);
      cvSink1.setEnabled(true);
    } else if (camNum == 1) {
      camNum = 0;
      cvSink0.setEnabled(true);
      cvSink1.setEnabled(false);
    }
  }

  public void initDefaultCommand() {
    setDefaultCommand(new PutVideo());
  }
}
