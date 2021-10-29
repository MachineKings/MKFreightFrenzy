package org.firstinspires.ftc.teamcode.Auton;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class Two  extends LinearOpMode {
   DcMotor frontLeft;
   DcMotor frontRight;
   DcMotor backRight;
   DcMotor backLeft;

   @Override
    public void  runOpMode() throws InterruptedException {
       frontLeft = hardwareMap.get();
       frontRight = hardwareMap.get();
       backRight = hardwareMap.get();
       backLeft = hardwareMap.get();

       //Forward
     waitForStart();
      frontRight.setPower(1);
      frontLeft.setPower(1);
      backRight.setPower(1);
      backLeft.setPower(1);
      sleep(2000);
      //backwards
       frontLeft.setPower(-1);
       frontRight.setPower(-1);
       backRight.setPower(-1);
       backLeft.setPower(-1);
       sleep(2000);
       //turn right
       frontRight.setPower(0);
       frontLeft.setPower(1);
       backLeft.setPower(1);
       backRight.setPower(0);
       sleep(2000);
       //turn left
       frontLeft.setPower(0);
       frontRight.setPower(1);
       backRight.setPower(0);
       backLeft.setPower(1);
       sleep(2000);
       //Box
       // park in the warehouse
       // ducks off c
       //
       //

   }
}
