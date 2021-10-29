package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class auton extends LinearOpMode {
    DcMotor frontRight;
    DcMotor backRight;
    DcMotor backLeft;
    DcMotor frontLeft;
    @Override
    public void runOpMode() throws InterruptedException {
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backRight = hardwareMap.dcMotor.get("backRight");
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        backLeft = hardwareMap.dcMotor.get("backLeft");

        //Forward
        frontRight.setPower(1);
        frontLeft.setPower(1);
        backLeft.setPower(1);
        backRight.setPower(1);

        //Backwards
        frontLeft.setPower(-1);
        frontRight.setPower(-1);
        backRight.setPower(-1);
        backLeft.setPower(-1);

        //turn right
        frontRight.setPower(0);
        backLeft.setPower(1);
        frontLeft.setPower(0);
        backRight.setPower(0);

        //turn left
        frontLeft.setPower(0);
        frontRight.setPower(1);
        backRight.setPower(1);
        backLeft.setPower(0);


    }

    }

