package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

//not a proper java class, wont run
@Disabled

public class VariableTest extends OpMode {

    @Override
    public void init(){

        //to create a variable in java, need to declare its data type(int, etc.)
        //mandatory to declare a variables data type

        //integer variable
        int robotHeight;

        //float variable, can be a decimal
        double motorSpeed;

        //boolean variable, true or false
        boolean clawClosed;

        //use an equals sign to assign a value to a variable
        //do not forget semicolon (;)
        robotHeight = 10;
        motorSpeed = 0.5;
        clawClosed = true;
    }

    @Override
    public void loop(){

    }
}
