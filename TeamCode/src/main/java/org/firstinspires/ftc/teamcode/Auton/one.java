package org.firstinspires.ftc.teamcode.Auton;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class one extends LinearOpMode  {
    DcMotor frontRight;
    DcMotor frontLeft;
    DcMotor backRight;
    DcMotor backLeft;
    //three servos

    @Override
    public void runOpMode()throws  InterruptedException{
        frontLeft = hardwareMap.;
        frontRight = hardwareMap.get( );
        backLeft = hardwareMap.get(  );
        backRight = hardwareMap.get(  );



        //Forward
        waitForStart();
        frontLeft.setPower(1);
        frontRight.setPower(1);
        backRight.setPower(1);
        backLeft.setPower(1);
        sleep(3000);
        //Backwards
        frontRight.setPower(-1);
        frontLeft.setPower(-1);
        backLeft.setPower(-1);
        backRight.setPower(-1);
        sleep(3000);
        //Turn right
        frontLeft.setPower(-1);
        frontRight.setPower(-1);
        backRight.setPower(-1);
        backLeft.setPower(-1);
        sleep(3000);
        //Turn left
        frontRight.setPower(0);
        frontLeft.setPower(1);
        backRight.setPower(0);
        backLeft.setPower(0);
        sleep(3000);
        //sonar scan
        //place block on
        //park fully in warehouse
    }
}
