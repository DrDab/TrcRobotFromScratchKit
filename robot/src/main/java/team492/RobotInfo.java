/*
 * Copyright (c) 2019 Titan Robotics Club (http://www.titanrobotics.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHEPIXYRWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package team492;

import frclib.FrcJoystick;
import frclib.FrcPixyCam1;
import trclib.TrcUtil;

public class RobotInfo
{
    public static final double BATTERY_CAPACITY_WATT_HOUR       = 18.0*12.0;
    public static final double BATTERY_NOMINAL_VOLTAGE          = 12.0;

    //
    // Joystick ports.
    //
    public static final int JSPORT_LEFT_DRIVESTICK              = 0;
    public static final int JSPORT_RIGHT_DRIVESTICK             = 1;
    public static final int JSPORT_OPERATORSTICK                = 2;
    public static final int JSPORT_BUTTON_PANEL                 = 3;
    public static final int JSPORT_SWITCH_PANEL                 = 4;

    //
    // CAN IDs.
    //
    public static final int CANID_LEFTFRONTWHEEL                = 3;    // 40A: Orange
    public static final int CANID_RIGHTFRONTWHEEL               = 4;    // 40A: Yellow
    public static final int CANID_LEFTREARWHEEL                 = 5;    // 40A: Green
    public static final int CANID_RIGHTREARWHEEL                = 6;    // 40A: Blue
    public static final int CANID_CLIMB_ACTUATOR                = 7;    // 40A: Purple
    public static final int CANID_UNUSED                        = 8;
    public static final int CANID_ELEVATOR                      = 9;    // 40A: White
    public static final int CANID_PICKUP_PITCH                  = 10;   // 40A: Orange
    public static final int CANID_CLIMB_WHEELS                  = 11;   // 40A: Yellow
    public static final int CANID_PICKUP                        = 12;   // 30A: Green

    public static final int CANID_PIGEON                        = 15;
    public static final int CANID_PDP                           = 16;
    public static final int CANID_PCM1                          = 17;
    public static final int CANID_PCM2                          = 18;

    //
    // PDP Channels.
    //
    public static final int PDP_CHANNEL_RIGHT_REAR_WHEEL        = 0;
    public static final int PDP_CHANNEL_RIGHT_DRIVE_MASTER      = 1;
    public static final int PDP_CHANNEL_PICKUP_PITCH            = 2;
    public static final int PDP_CHANNEL_RIGHT_FRONT_WHEEL       = 3;
    public static final int PDP_CHANNEL_PICKUP                  = 4;
    public static final int PDP_CHANNEL_PIGEON                  = 8;
    public static final int PDP_CHANNEL_BLINKIN                 = 9;
    public static final int PDP_CHANNEL_RING_LIGHT              = 10;
    public static final int PDP_CHANNEL_CLIBMER_WHEELS          = 11;
    public static final int PDP_CHANNEL_LEFT_FRONT_WHEEL        = 12;
    public static final int PDP_CHANNEL_ELEVATOR                = 13;
    //public static final int PDP_CHANNEL_LEFT_DRIVE_MASTER       = 14;
    public static final int PDP_CHANNEL_CLIMBER                 = 14;
    public static final int PDP_CHANNEL_LEFT_REAR_WHEEL         = 15;

    //
    // DriveBase subsystem.
    //
    public static final double DRIVE_STALL_TIMEOUT              = 0.5;

    public static final double DRIVE_SLOW_XSCALE                = 0.5;
    public static final double DRIVE_SLOW_YSCALE                = 0.5;
    public static final double DRIVE_SLOW_TURNSCALE             = 0.4;

    public static final double DRIVE_MEDIUM_XSCALE              = 0.75;
    public static final double DRIVE_MEDIUM_YSCALE              = 0.75;
    public static final double DRIVE_MEDIUM_TURNSCALE           = 0.6;

    public static final double DRIVE_FAST_XSCALE                = 1.0;
    public static final double DRIVE_FAST_YSCALE                = 1.0;
    public static final double DRIVE_FAST_TURNSCALE             = 0.8;

    public static final double DRIVE_GYRO_ASSIST_KP             = 1.5;
    public static final double DRIVE_MAX_ROTATION_RATE          = 6.5;      //radians per second

    public static final double DRIVE_MAX_XPID_POWER             = 0.5;
    public static final double DRIVE_MAX_YPID_POWER             = 0.6;
    public static final double DRIVE_MAX_TURNPID_POWER          = 1.0;

    public static final double DRIVE_MAX_XPID_RAMP_RATE         = 0.5;
    public static final double DRIVE_MAX_YPID_RAMP_RATE         = 0.6;
    public static final double DRIVE_MAX_TURNPID_RAMP_RATE      = 1.0;
    
    public static final double ENCODER_X_INCHES_PER_COUNT       = 0.0;
    public static final double ENCODER_X_KP                     = 0.0;
    public static final double ENCODER_X_KI                     = 0.0;
    public static final double ENCODER_X_KD                     = 0.0;
    public static final double ENCODER_X_KF                     = 0.0;
    public static final double ENCODER_X_TOLERANCE              = 0.0;

    public static final double ENCODER_X_KP_SMALL               = 0.0;
    public static final double ENCODER_X_KI_SMALL               = 0.0;
    public static final double ENCODER_X_KD_SMALL               = 0.0;
    public static final double ENCODER_X_KF_SMALL               = 0.0;
    public static final double ENCODER_X_TOLERANCE_SMALL        = 0.0;

    public static final double ENCODER_Y_INCHES_PER_COUNT       = 0.0;
    public static final double ENCODER_Y_KP                     = 0.0;
    public static final double ENCODER_Y_KI                     = 0.0;
    public static final double ENCODER_Y_KD                     = 0.0;
    public static final double ENCODER_Y_KF                     = 0.0;
    public static final double ENCODER_Y_TOLERANCE              = 0.0;

    public static final double GYRO_TURN_KP                     = 0.0;
    public static final double GYRO_TURN_KI                     = 0.0;
    public static final double GYRO_TURN_KD                     = 0.0;
    public static final double GYRO_TURN_KF                     = 0.0;
    public static final double GYRO_TURN_TOLERANCE              = 0.0;

    public static final double GYRO_TURN_KP_SMALL               = 0.0;
    public static final double GYRO_TURN_KI_SMALL               = 0.0;
    public static final double GYRO_TURN_KD_SMALL               = 0.0;
    public static final double GYRO_TURN_KF_SMALL               = 0.0;
    public static final double GYRO_TURN_TOLERANCE_SMALL        = 0.0;


}   // class RobotInfo
