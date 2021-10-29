package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.robot.Robot;

import org.firstinspires.ftc.teamcode.Hardware.Robotdumptruck;

@TeleOp (name ="teleopprac " , group = "Machine Kings")
@Disabled
public class teleopprac extends OpMode{
    /* Declare OpMode members.*/
      DcMotor FrontRight;
      DcMotor FrontLeft;
      DcMotor BackRight;
      DcMotor BackLeft;
      CRServo carousel;

 /*
 *  Code to run ONCE when the driver hits INIT
  */

    @Override
    public void init () {
        /* Initialize the hardware varibles.
         * The init() method of the hardware class does all the work here
         */

        //Send telemetry message to signify robot waiting
        FrontRight = hardwareMap.dcMotor.get("FrontRight");
        FrontLeft = hardwareMap.dcMotor.get("FrontLeft");
        BackRight = hardwareMap.dcMotor.get("BackRight");
        BackLeft = hardwareMap.dcMotor.get("BackLeft");
        carousel = hardwareMap.crservo.get("carousel");
        //bucketarm = hardwareMap.dcMotor.get("bucketarm");
        //drawerslide = hardwareMap.dcMotor.get("drawerslide");
        //intake = hardwareMap.dcMotor.get("intake");


    }
    @Override
    public void  loop(){
        if (Math.abs(-gamepad1.left_stick_x)>.1){
            FrontLeft.setPower(-gamepad1.left_stick_y);

            }


        }


        @Override
        public void stop () {

        }


    }
