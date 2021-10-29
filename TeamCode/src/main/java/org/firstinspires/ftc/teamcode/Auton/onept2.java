package org.firstinspires.ftc.teamcode.Auton;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class onept2 extends LinearOpMode {
DcMotor frontRight;
DcMotor frontLeft;
DcMotor backRight;
DcMotor backLeft;
@Override
    public void runOpMode() throws InterruptedException{
    frontLeft = hardwareMap.get();
    frontRight= hardwareMap.get();
    backLeft = hardwareMap.get();
    backRight = hardwareMap.get();








    }



}
