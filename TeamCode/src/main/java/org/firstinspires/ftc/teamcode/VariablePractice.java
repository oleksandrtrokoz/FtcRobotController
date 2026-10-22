package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;



//need init method and loop method, and either @TeleOp and @Autonomous to show up in driver station
@TeleOp
public class VariablePractice extends OpMode {

    @Override
    public void init() {

        //can assign values to a variable as you initialize a variable
        //do not forget semicolons

        //in java, a string is not a variable, a string is a class
        //variables always use camelCase, where the first letter is lowercase, and then you can use uppercase
        //classes use uppercase first, then you can use uppercase optionally

        int teamNumber = 11111;
        double motorSpeed = 0.75;
        boolean clawClosed = true;

        int motorAngle = 180;

        //string is a class
        String name = "Sasha";

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw Closed", clawClosed);
        telemetry.addData("Name", name);

        telemetry.addData("Motor Angle", motorAngle);
    }

    @Override
    public void loop() {
        //initialize variables outside the loop to not waste time on initializing them while the program runs
    }
}
