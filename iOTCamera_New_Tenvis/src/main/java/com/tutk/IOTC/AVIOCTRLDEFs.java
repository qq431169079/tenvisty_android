package com.tutk.IOTC;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class AVIOCTRLDEFs {

    /* AVAPIs IOCTRL Message Type */
    public static final int IOTYPE_USER_IPCAM_START = 0x01FF;
    public static final int IOTYPE_USER_IPCAM_STOP = 0x02FF;

    public static final int IOTYPE_USER_IPCAM_AUDIOSTART = 0x0300;
    public static final int IOTYPE_USER_IPCAM_AUDIOSTOP = 0x0301;

    public static final int IOTYPE_USER_IPCAM_SPEAKERSTART = 0x0350;
    public static final int IOTYPE_USER_IPCAM_SPEAKERSTOP = 0x0351;

    public static final int IOTYPE_USER_IPCAM_SETSTREAMCTRL_REQ = 0x0320;
    public static final int IOTYPE_USER_IPCAM_SETSTREAMCTRL_RESP = 0x0321;
    public static final int IOTYPE_USER_IPCAM_GETSTREAMCTRL_REQ = 0x0322;
    public static final int IOTYPE_USER_IPCAM_GETSTREAMCTRL_RESP = 0x0323;

    public static final int IOTYPE_USER_IPCAM_SETMOTIONDETECT_REQ = 0x0324;
    public static final int IOTYPE_USER_IPCAM_SETMOTIONDETECT_RESP = 0x0325;
    public static final int IOTYPE_USER_IPCAM_GETMOTIONDETECT_REQ = 0x0326;
    public static final int IOTYPE_USER_IPCAM_GETMOTIONDETECT_RESP = 0x0327;

    public static final int IOTYPE_USER_IPCAM_GETSUPPORTSTREAM_REQ = 0x0328;
    public static final int IOTYPE_USER_IPCAM_GETSUPPORTSTREAM_RESP = 0x0329;

    public static final int IOTYPE_USER_IPCAM_GETAUDIOOUTFORMAT_REQ = 0x032A;
    public static final int IOTYPE_USER_IPCAM_GETAUDIOOUTFORMAT_RESP = 0x032B;

    public static final int IOTYPE_USER_IPCAM_DEVINFO_REQ = 0x0330;
    public static final int IOTYPE_USER_IPCAM_DEVINFO_RESP = 0x0331;

    public static final int IOTYPE_USER_IPCAM_SETPASSWORD_REQ = 0x0332;
    public static final int IOTYPE_USER_IPCAM_SETPASSWORD_RESP = 0x0333;

    public static final int IOTYPE_USER_IPCAM_LISTWIFIAP_REQ = 0x0340;
    public static final int IOTYPE_USER_IPCAM_LISTWIFIAP_RESP = 0x0341;
    public static final int IOTYPE_USER_IPCAM_SETWIFI_REQ = 0x0342;
    public static final int IOTYPE_USER_IPCAM_SETWIFI_RESP = 0x0343;
    public static final int IOTYPE_USER_IPCAM_GETWIFI_REQ = 0x0344;
    public static final int IOTYPE_USER_IPCAM_GETWIFI_RESP = 0x0345;
    public static final int IOTYPE_USER_IPCAM_SETWIFI_REQ_2 = 0x0346;
    public static final int IOTYPE_USER_IPCAM_GETWIFI_RESP_2 = 0x0347;

    public static final int IOTYPE_USER_IPCAM_SETRECORD_REQ = 0x0310;
    public static final int IOTYPE_USER_IPCAM_SETRECORD_RESP = 0x0311;
    public static final int IOTYPE_USER_IPCAM_GETRECORD_REQ = 0x0312;
    public static final int IOTYPE_USER_IPCAM_GETRECORD_RESP = 0x0313;

    public static final int IOTYPE_USER_IPCAM_SETRCD_DURATION_REQ = 0x0314;
    public static final int IOTYPE_USER_IPCAM_SETRCD_DURATION_RESP = 0x0315;
    public static final int IOTYPE_USER_IPCAM_GETRCD_DURATION_REQ = 0x0316;
    public static final int IOTYPE_USER_IPCAM_GETRCD_DURATION_RESP = 0x0317;

    public static final int IOTYPE_USER_IPCAM_LISTEVENT_REQ = 0x0318;
    public static final int IOTYPE_USER_IPCAM_LISTEVENT_RESP = 0x0319;

    public static final int IOTYPE_USER_IPCAM_RECORD_PLAYCONTROL = 0x031A;
    public static final int IOTYPE_USER_IPCAM_RECORD_PLAYCONTROL_RESP = 0x031B;

    public static final int IOTYPE_USER_IPCAM_GET_EVENTCONFIG_REQ = 0x0400;
    public static final int IOTYPE_USER_IPCAM_GET_EVENTCONFIG_RESP = 0x0401;
    public static final int IOTYPE_USER_IPCAM_SET_EVENTCONFIG_REQ = 0x0402;
    public static final int IOTYPE_USER_IPCAM_SET_EVENTCONFIG_RESP = 0x0403;

    public static final int IOTYPE_USER_IPCAM_SET_ENVIRONMENT_REQ = 0x0360;
    public static final int IOTYPE_USER_IPCAM_SET_ENVIRONMENT_RESP = 0x0361;
    public static final int IOTYPE_USER_IPCAM_GET_ENVIRONMENT_REQ = 0x0362;
    public static final int IOTYPE_USER_IPCAM_GET_ENVIRONMENT_RESP = 0x0363;

    public static final int IOTYPE_USER_IPCAM_SET_VIDEOMODE_REQ = 0x0370;
    public static final int IOTYPE_USER_IPCAM_SET_VIDEOMODE_RESP = 0x0371;
    public static final int IOTYPE_USER_IPCAM_GET_VIDEOMODE_REQ = 0x0372;
    public static final int IOTYPE_USER_IPCAM_GET_VIDEOMODE_RESP = 0x0373;

    public static final int IOTYPE_USER_IPCAM_FORMATEXTSTORAGE_REQ = 0x380;
    public static final int IOTYPE_USER_IPCAM_FORMATEXTSTORAGE_RESP = 0x381;

    public static final int IOTYPE_USER_IPCAM_PTZ_COMMAND = 0x1001;

    public static final int IOTYPE_USER_IPCAM_EVENT_REPORT = 0x1FFF;

    public static final int IOTYPE_USER_IPCAM_RECEIVE_FIRST_IFRAME = 0x1002;    // Send from client, used to talk to device that

    public static final int IOTYPE_USER_IPCAM_GET_FLOWINFO_REQ = 0x0390;
    public static final int IOTYPE_USER_IPCAM_GET_FLOWINFO_RESP = 0x0391;
    public static final int IOTYPE_USER_IPCAM_CURRENT_FLOWINFO = 0x0392;

    public static final int IOTYPE_USER_IPCAM_GET_TIMEZONE_REQ = 0x3A0;
    public static final int IOTYPE_USER_IPCAM_GET_TIMEZONE_RESP = 0x3A1;
    public static final int IOTYPE_USER_IPCAM_SET_TIMEZONE_REQ = 0x3B0;
    public static final int IOTYPE_USER_IPCAM_SET_TIMEZONE_RESP = 0x3B1;


    /* AVAPIs IOCTRL Event Type */
    public static final int AVIOCTRL_EVENT_ALL = 0x00;
    public static final int AVIOCTRL_EVENT_MOTIONDECT = 0x01;
    public static final int AVIOCTRL_EVENT_VIDEOLOST = 0x02;
    public static final int AVIOCTRL_EVENT_IOALARM = 0x03;
    public static final int AVIOCTRL_EVENT_MOTIONPASS = 0x04;
    public static final int AVIOCTRL_EVENT_VIDEORESUME = 0x05;
    public static final int AVIOCTRL_EVENT_IOALARMPASS = 0x06;
    public static final int AVIOCTRL_EVENT_EXPT_REBOOT = 0x10;
    public static final int AVIOCTRL_EVENT_SDFAULT = 0x11;

    /* EVEENT SNAP REQUEST type */
    public static final int AVIOCTRL_EVENT_SNAP_RESP = 0x22; // 门铃推送事件
    public static final int AVIOCTRL_EVENT_BELL_RING = 0x23; // 响铃
    public static final int AVIOCTRL_EVENT_SNAP_NO_RING = 0x26;// 离线图片传送

    /* AVAPIs IOCTRL Play Record Command */
    public static final int AVIOCTRL_RECORD_PLAY_PAUSE = 0x00;
    public static final int AVIOCTRL_RECORD_PLAY_STOP = 0x01;
    public static final int AVIOCTRL_RECORD_PLAY_STEPFORWARD = 0x02;
    public static final int AVIOCTRL_RECORD_PLAY_STEPBACKWARD = 0x03;
    public static final int AVIOCTRL_RECORD_PLAY_FORWARD = 0x04;
    public static final int AVIOCTRL_RECORD_PLAY_BACKWARD = 0x05;
    public static final int AVIOCTRL_RECORD_PLAY_SEEKTIME = 0x06;
    public static final int AVIOCTRL_RECORD_PLAY_END = 0x07;
    public static final int AVIOCTRL_RECORD_PLAY_START = 0x10;

    // AVIOCTRL PTZ Command Value
    public static final int AVIOCTRL_PTZ_STOP = 0;
    public static final int AVIOCTRL_PTZ_UP = 1;
    public static final int AVIOCTRL_PTZ_DOWN = 2;
    public static final int AVIOCTRL_PTZ_LEFT = 3;
    public static final int AVIOCTRL_PTZ_LEFT_UP = 4;
    public static final int AVIOCTRL_PTZ_LEFT_DOWN = 5;
    public static final int AVIOCTRL_PTZ_RIGHT = 6;
    public static final int AVIOCTRL_PTZ_RIGHT_UP = 7;
    public static final int AVIOCTRL_PTZ_RIGHT_DOWN = 8;
    public static final int AVIOCTRL_PTZ_AUTO = 9;
    public static final int AVIOCTRL_PTZ_SET_POINT = 10;
    public static final int AVIOCTRL_PTZ_CLEAR_POINT = 11;
    public static final int AVIOCTRL_PTZ_GOTO_POINT = 12;
    public static final int AVIOCTRL_PTZ_SET_MODE_START = 13;
    public static final int AVIOCTRL_PTZ_SET_MODE_STOP = 14;
    public static final int AVIOCTRL_PTZ_MODE_RUN = 15;
    public static final int AVIOCTRL_PTZ_MENU_OPEN = 16;
    public static final int AVIOCTRL_PTZ_MENU_EXIT = 17;
    public static final int AVIOCTRL_PTZ_MENU_ENTER = 18;
    public static final int AVIOCTRL_PTZ_FLIP = 19;
    public static final int AVIOCTRL_PTZ_START = 20;

    public static final int AVIOCTRL_LENS_APERTURE_OPEN = 21;
    public static final int AVIOCTRL_LENS_APERTURE_CLOSE = 22;
    public static final int AVIOCTRL_LENS_ZOOM_IN = 23;
    public static final int AVIOCTRL_LENS_ZOOM_OUT = 24;
    public static final int AVIOCTRL_LENS_FOCAL_NEAR = 25;
    public static final int AVIOCTRL_LENS_FOCAL_FAR = 26;

    public static final int AVIOCTRL_AUTO_PAN_SPEED = 27;
    public static final int AVIOCTRL_AUTO_PAN_LIMIT = 28;
    public static final int AVIOCTRL_AUTO_PAN_START = 29;

    public static final int AVIOCTRL_PATTERN_START = 30;
    public static final int AVIOCTRL_PATTERN_STOP = 31;
    public static final int AVIOCTRL_PATTERN_RUN = 32;

    public static final int AVIOCTRL_SET_AUX = 33;
    public static final int AVIOCTRL_CLEAR_AUX = 34;
    public static final int AVIOCTRL_MOTOR_RESET_POSITION = 35;

    /* AVAPIs IOCTRL Quality Type */
    public static final int AVIOCTRL_QUALITY_UNKNOWN = 0x00;
    public static final int AVIOCTRL_QUALITY_MAX = 0x01;
    public static final int AVIOCTRL_QUALITY_HIGH = 0x02;
    public static final int AVIOCTRL_QUALITY_MIDDLE = 0x03;
    public static final int AVIOCTRL_QUALITY_LOW = 0x04;
    public static final int AVIOCTRL_QUALITY_MIN = 0x05;

    /* AVAPIs IOCTRL WiFi Mode */
    public static final int AVIOTC_WIFIAPMODE_ADHOC = 0x00;
    public static final int AVIOTC_WIFIAPMODE_MANAGED = 0x01;

    /* AVAPIs IOCTRL WiFi Enc Type */
    public static final int AVIOTC_WIFIAPENC_INVALID = 0x00;
    public static final int AVIOTC_WIFIAPENC_NONE = 0x01;
    public static final int AVIOTC_WIFIAPENC_WEP = 0x02;
    public static final int AVIOTC_WIFIAPENC_WPA_TKIP = 0x03;
    public static final int AVIOTC_WIFIAPENC_WPA_AES = 0x04;
    public static final int AVIOTC_WIFIAPENC_WPA2_TKIP = 0x05;
    public static final int AVIOTC_WIFIAPENC_WPA2_AES = 0x06;

    /* AVAPIs IOCTRL Recording Type */
    public static final int AVIOTC_RECORDTYPE_OFF = 0x00;
    public static final int AVIOTC_RECORDTYPE_FULLTIME = 0x01;
    public static final int AVIOTC_RECORDTYPE_ALAM = 0x02;
    public static final int AVIOTC_RECORDTYPE_MANUAL = 0x03;

    public static final int AVIOCTRL_ENVIRONMENT_INDOOR_50HZ = 0x00;
    public static final int AVIOCTRL_ENVIRONMENT_INDOOR_60HZ = 0x01;
    public static final int AVIOCTRL_ENVIRONMENT_OUTDOOR = 0x02;
    public static final int AVIOCTRL_ENVIRONMENT_NIGHT = 0x03;

    /* AVIOCTRL VIDEO MODE */
    public static final int AVIOCTRL_VIDEOMODE_NORMAL = 0x00;
    public static final int AVIOCTRL_VIDEOMODE_FLIP = 0x01;
    public static final int AVIOCTRL_VIDEOMODE_MIRROR = 0x02;
    public static final int AVIOCTRL_VIDEOMODE_FLIP_MIRROR = 0x03;


    public static final int IOTYPE_USER_IPCAM_GET_ALARMLED_CONTRL_REQ = 0x40086;
    public static final int IOTYPE_USER_IPCAM_GET_ALARMLED_CONTRL_RESP = 0x40087;
    public static final int IOTYPE_USER_IPCAM_SET_ALARMLED_CONTRL_REQ = 0x40084;
    public static final int IOTYPE_USER_IPCAM_SET_ALARMLED_CONTRL_RESP = 0x40085;

    public static final int IOTYPE_USER_IPCAM_GET_OSD_ONOFF_REQ = 0x50023;
    public static final int IOTYPE_USER_IPCAM_GET_OSD_ONOFF_RESP = 0x50024;
    public static final int IOTYPE_USER_IPCAM_SET_OSD_ONOFF_REQ = 0x50021;
    public static final int IOTYPE_USER_IPCAM_SET_OSD_ONOFF_RESP = 0x50022;
    public static final int IOTYPE_USER_IPCAM_GET_AUSDOM_PIR_SENSITIVITY_REQ = 0x40072;
    public static final int IOTYPE_USER_IPCAM_GET_AUSDOM_PIR_SENSITIVITY_RESP = 0x40073;
    public static final int IOTYPE_USER_IPCAM_SET_AUSDOM_PIR_SENSITIVITY_REQ = 0x40070;
    public static final int IOTYPE_USER_IPCAM_SET_AUSDOM_PIR_SENSITIVITY_RESP = 0x40071;
    public static final int IOTYPE_USER_IPCAM_GET_ALARM_TIME_REQ = 0x50031;
    public static final int IOTYPE_USER_IPCAM_GET_ALARM_TIME_RESP = 0x50032;
    public static final int IOTYPE_USER_IPCAM_SET_ALARM_TIME_REQ = 0x50033;
    public static final int IOTYPE_USER_IPCAM_SET_ALARM_TIME_RESP = 0x50034;
    public static final int IOTYPE_USER_IPCAM_GET_FORAMT_RESULT_REQ = 0x0382; // Format external storage
    public static final int IOTYPE_USER_IPCAM_GET_FORAMT_RESULT_RESP = 0x0383;
    public static final int IOTYPE_USER_IPCAM_SET_TIMEMODE_TO_SHARE_REQ = 0X40074;    // set time mode 0 Chinese 1 America 2 Europe
    public static final int IOTYPE_USER_IPCAM_SET_TIMEMODE_TO_SHARE_RESP = 0X40075;
    public static final int IOTYPE_USER_IPCAM_GET_TIMEMODE_TO_SHARE_REQ = 0X40076;    // get time mode 0 Chinese 1 America 2 Europe
    public static final int IOTYPE_USER_IPCAM_GET_TIMEMODE_TO_SHARE_RESP = 0X40077;
    public static final int IOTYPE_USER_IPCAM_REBOOT_SYSTEM_REQ = 0x40019;
    public static final int IOTYPE_USER_IPCAM_REBOOT_SYSTEM_RESP = 0x40020;
    public static final int IOTYPE_USER_IPCAM_GET_DEVICEMODEL_CONFIG_REQ = 0X40056;    //读取装备信息
    public static final int IOTYPE_USER_IPCAM_GET_DEVICEMODEL_CONFIG_RESP = 0X40057;
    public static final int IOTYPE_USER_IPCAM_SET_DEVICEMODEL_CONFIG_REQ = 0X40058;    //写入装备信息
    public static final int IOTYPE_USER_IPCAM_SET_DEVICEMODEL_CONFIG_RESP = 0X40059;

    public static final int IOTYPE_USER_IPCAM_AUSDOM_LISTDIR_REQ = 0x50035;
    public static final int IOTYPE_USER_IPCAM_AUSDOM_LISTDIR_RESP = 0x50036;
    // 20、获取电池当前状态
    public static final int IOTYPE_USER_IPCAM_GET_BAT_PRAM_REQ = 0x50058;
    public static final int IOTYPE_USER_IPCAM_GET_BAT_PRAM_RESP = 0x50059;
    //电池电量推送提醒
    public static final int IOTYPE_USER_IPCAM_SET_BAT_PUSH_EN_REQ = 0X400A3;
    public static final int IOTYPE_USER_IPCAM_SET_BAT_PUSH_EN_RESP = 0X400A4;
    public static final int IOTYPE_USER_IPCAM_GET_BAT_PUSH_EN_REQ = 0X400A5;
    public static final int IOTYPE_USER_IPCAM_GET_BAT_PUSH_EN_RESP = 0X400A6;
    //门铃推送
    public static final int IOTYPE_USER_IPCAM_SET_DB_PUSH_EN_REQ = 0X400A7;
    public static final int IOTYPE_USER_IPCAM_SET_DB_PUSH_EN_RESP = 0X400A8;
    public static final int IOTYPE_USER_IPCAM_GET_DB_PUSH_EN_REQ = 0X400A9;
    public static final int IOTYPE_USER_IPCAM_GET_DB_PUSH_EN_RESP = 0X400AA;
    //24、OTA升级固件相关
// AUSDOM REMOTE UPGRADE  升级请求
    public static final int IOTYPE_USER_IPCAM_REMOTE_UPGRADE_REQ = 0X6008E;
    public static final int IOTYPE_USER_IPCAM_REMOTE_UPGRADE_RESP = 0X6008F;
    public static final int IOTYPE_USER_IPCAM_UPGRADE_PROGRESS_REQ = 0X60090;
    public static final int IOTYPE_USER_IPCAM_UPGRADE_PROGRESS_RESP = 0X60091;

    //推送开关设置
//开关推送设置请求/获取
    //报警推送设置
    public static final int IOTYPE_USER_IPCAM_SET_ALARM_PUSH_EN_REQ = 0X4009F;
    public static final int IOTYPE_USER_IPCAM_SET_ALARM_PUSH_EN_RESP = 0X400A0;
    public static final int IOTYPE_USER_IPCAM_GET_ALARM_PUSH_EN_REQ = 0X400A1;
    public static final int IOTYPE_USER_IPCAM_GET_ALARM_PUSH_EN_RESP = 0X400A2;


    //PIR灵敏度设置
    public static final int IOTYPE_USER_IPCAM_SET_PIR_SENSITIVITY_REQ = 0X6000c; //PIR SENSITIVITY
    public static final int IOTYPE_USER_IPCAM_SET_PIR_SENSITIVITY_RESP = 0X6000d;
    public static final int IOTYPE_USER_IPCAM_GET_PIR_SENSITIVITY_REQ = 0X6000e;
    public static final int IOTYPE_USER_IPCAM_GET_PIR_SENSITIVITY_RESP = 0X6000f;
    //PIR开关：
    public static final int IOTYPE_USER_IPCAM_SET_ARM_STATUS_REQ = 0X60008; // ARM/DISARM
    public static final int IOTYPE_USER_IPCAM_SET_ARM_STATUS_RESP = 0X60009;
    public static final int IOTYPE_USER_IPCAM_GET_ARM_STATUS_REQ = 0X6000a;
    public static final int IOTYPE_USER_IPCAM_GET_ARM_STATUS_RESP = 0X6000b;

    public static final int IOTYPE_USER_IPCAM_SET_NTP_CONFIG_REQ = 0X40050;    //写入ntp的配置信息
    public static final int IOTYPE_USER_IPCAM_SET_NTP_CONFIG_RESP = 0X40051;
    public static final int IOTYPE_USER_IPCAM_GET_NTP_CONFIG_REQ = 0X40052;    //读取ntp的配置信息
    public static final int IOTYPE_USER_IPCAM_GET_NTP_CONFIG_RESP = 0X40053;


    //user-defined cmd type
    //preset point operate
    public static final int IOTYPE_USER_IPCAM_GET_PRESET_LIST_REQ = 0x2001;
    public static final int IOTYPE_USER_IPCAM_GET_PRESET_LIST_RESP = 0x2002;

    public static final int IOTYPE_USER_IPCAM_SET_PRESET_POINT_REQ = 0x2003;
    public static final int IOTYPE_USER_IPCAM_SET_PRESET_POINT_RESP = 0x2004;

    public static final int IOTYPE_USER_IPCAM_OPR_PRESET_POINT_REQ = 0x2005;
    public static final int IOTYPE_USER_IPCAM_OPR_PRESET_POINT_RESP = 0x2006;

    //daylight saving time
//    public static final int IOTYPE_USER_IPCAM_GET_DST_REQ = 0x2007;
//    public static final int IOTYPE_USER_IPCAM_GET_DST_RESP = 0x2008;

//    public static final int IOTYPE_USER_IPCAM_SET_DST_REQ = 0x2009;
//    public static final int IOTYPE_USER_IPCAM_SET_DST_RESP = 0x200A;

    //reboot
    public static final int IOTYPE_USER_IPCAM_REBOOT_REQ = 0x200B;
    public static final int IOTYPE_USER_IPCAM_REBOOT_RESP = 0x200C;

    //reset to default
    public static final int IOTYPE_USER_IPCAM_RESET_DEFAULT_REQ = 0x200D;
    public static final int IOTYPE_USER_IPCAM_RESET_DEFAULT_RESP = 0x200E;

    public static final int IOTYPE_USER_IPCAM_GET_UPRADE_URL_REQ = 0x2017;
    public static final int IOTYPE_USER_IPCAM_GET_UPRADE_URL_RESP = 0x2018;

    public static final int IOTYPE_USER_IPCAM_SET_UPRADE_REQ = 0x2019;
    public static final int IOTYPE_USER_IPCAM_SET_UPRADE_RESP = 0x2020;
    public static final int IOTYPE_USER_IPCAM_UPGRADE_STATUS = 0x2021;

    public static final int IOTYPE_USER_IPCAM_GET_FIRMWARE_INFO_REQ = 0x2022;
    public static final int IOTYPE_USER_IPCAM_GET_FIRMWARE_INFO_RESP = 0x2023;
    public static final int IOTYPE_USER_IPCAM_GET_TIME_INFO_REQ = 0x2024;
    public static final int IOTYPE_USER_IPCAM_GET_TIME_INFO_RESP = 0x2025;
    public static final int IOTYPE_USER_IPCAM_SET_TIME_INFO_REQ = 0x2026;
    public static final int IOTYPE_USER_IPCAM_SET_TIME_INFO_RESP = 0x2027;
    public static final int IOTYPE_USER_IPCAM_GET_ZONE_INFO_REQ = 0x2028;
    public static final int IOTYPE_USER_IPCAM_GET_ZONE_INFO_RESP = 0x2029;
    public static final int IOTYPE_USER_IPCAM_SET_ZONE_INFO_REQ = 0x202A;
    public static final int IOTYPE_USER_IPCAM_SET_ZONE_INFO_RESP = 0x202B;

    public static final int IOTYPE_USER_IPCAM_UPDATE_WIFI_STATUS = 0x202C;

    // = 0x202C


    //IOTYPE_USER_CMD_MAX
    public static class SMsgAVIOCtrlGetAlarmLedReq {
        public static byte[] parseContent(int paramInt) {
            byte[] arrayOfByte = new byte[8];
            System.arraycopy(Packet.intToByteArray_Little(paramInt), 0, arrayOfByte, 0, 4);
            return arrayOfByte;
        }
    }

    public static class SMsgAVIOCtrlSetAlarmLedReq {
        public static byte[] parseContent(int paramInt) {
            byte[] arrayOfByte = new byte[8];
            System.arraycopy(Packet.intToByteArray_Little(paramInt), 0, arrayOfByte, 0, 4);
            return arrayOfByte;
        }
    }

    public static class SFrameInfo {

        short codec_id;
        byte flags;
        byte cam_index;
        byte onlineNum;
        byte[] reserved = new byte[3];
        int reserved2;
        int timestamp;

        public static byte[] parseContent(short codec_id, byte flags, byte cam_index, byte online_num, int timestamp) {

            byte[] result = new byte[16];

            byte[] codec = Packet.shortToByteArray_Little(codec_id);
            System.arraycopy(codec, 0, result, 0, 2);

            result[2] = flags;
            result[3] = cam_index;
            result[4] = online_num;

            byte[] time = Packet.intToByteArray_Little(timestamp);
            System.arraycopy(time, 0, result, 12, 4);

            return result;
        }
    }

    public static class SMsgAVIoctrlAVStream {
        int channel = 0; // camera index
        byte[] reserved = new byte[4];

        public static byte[] parseContent(int channel) {
            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlEventConfig {
        long channel; // Camera Index
        byte mail; // enable send email
        byte ftp; // enable ftp upload photo
        byte localIO; // enable local io output
        byte p2pPushMsg; // enable p2p push msg
    }

    public static class SMsgAVIoctrlPtzCmd {
        byte control; // ptz control command
        byte speed; // ptz control speed
        byte point;
        byte limit;
        byte aux;
        byte channel; // camera index
        byte[] reserved = new byte[2];

        public static byte[] parseContent(byte control, byte speed, byte point, byte limit, byte aux, byte channel) {
            byte[] result = new byte[8];

            result[0] = control;
            result[1] = speed;
            result[2] = point;
            result[3] = limit;
            result[4] = aux;
            result[5] = channel;

            return result;
        }
    }

    public static class SMsgAVIoctrlSetStreamCtrlReq {
        int channel; // Camera Index
        byte quality; // AVIOCTRL_QUALITY_XXXX
        byte[] reserved = new byte[3];

        public static byte[] parseContent(int channel, byte quality) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);
            result[4] = quality;

            return result;
        }
    }

    public class SMsgAVIoctrlGetStreamCtrlResp {
        int channel; // Camera Index
        byte quality; // AVIOCTRL_QUALITY_XXXX
        byte[] reserved = new byte[3];
    }

    public class SMsgAVIoctrlSetStreamCtrlResp {
        int result;
        byte[] reserved = new byte[4];
    }

    public static class SMsgAVIoctrlGetStreamCtrlReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent(int channel) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public static class SMsgAVIoctrlSetMotionDetectReq {
        int channel; // Camera Index
        int sensitivity; /* 0(disbale) ~ 100(MAX) */

        public static byte[] parseContent(int channel, int sensitivity) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            byte[] sen = Packet.intToByteArray_Little(sensitivity);

            System.arraycopy(ch, 0, result, 0, 4);
            System.arraycopy(sen, 0, result, 4, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlSetMotionDetectResp {
        byte result;
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlGetMotionDetectReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent(int channel) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlGetMotionDetectResp {
        int channel; // Camera Index
        int sensitivity; /* 0(disbale) ~ 100(MAX) */
    }

    public static class SMsgAVIoctrlDeviceInfoReq {

        static byte[] reserved = new byte[4];

        public static byte[] parseContent() {
            return reserved;
        }
    }

    /**
     * 设备信息
     */
    public static class SMsgAVIoctrlDeviceInfoResp {

        public SMsgAVIoctrlDeviceInfoResp(byte[] data) {
            if (data != null && data.length >= 48) {
                System.arraycopy(data, 0, this.model, 0, 16);
                System.arraycopy(data, 16, this.vendor, 0, 16);
                this.version = Packet.byteArrayToInt_Little(data, 32);
                this.total = Packet.byteArrayToInt_Little(data, 36);
                this.free = Packet.byteArrayToInt_Little(data, 40);
            }
        }

        public byte[] model = new byte[16];    //產品型號
        public byte[] vendor = new byte[16];    //產品製造商
        public int version;    //產品版本資訊
        public int channel;    //暫不用，預留
        public int total;	 /* MByte  MBytes, total space size for sdcard*/
        public int free; 	/* MByte   MBytes , free space size for sdcard */
        byte[] reserved = new byte[8];
    }

    public static class SMsgAVIoctrlSetPasswdReq {
        byte[] oldPasswd = new byte[32];
        byte[] newPasswd = new byte[32];

        public static byte[] parseContent(String oldPwd, String newPwd) {

            byte[] oldpwd = oldPwd.getBytes();
            byte[] newpwd = newPwd.getBytes();
            byte[] result = new byte[64];

            System.arraycopy(oldpwd, 0, result, 0, oldpwd.length);
            System.arraycopy(newpwd, 0, result, 32, newpwd.length);

            return result;
        }
    }

    public class SMsgAVIoctrlSetPasswdResp {
        byte result;
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlListWifiApReq {

        static byte[] reserved = new byte[4];

        public static byte[] parseContent() {

            return reserved;
        }
    }

    public static class SWifiAp {
        public byte[] ssid = new byte[32];
        public byte mode;
        public byte enctype;
        public byte signal;
        public byte status;

        public static int getTotalSize() {
            return 36;
        }

        public SWifiAp(byte[] data) {

            System.arraycopy(data, 1, ssid, 0, data.length);
            mode = data[32];
            enctype = data[33];
            signal = data[34];
            status = data[35];
        }

        public SWifiAp(byte[] bytsSSID, byte bytMode, byte bytEnctype, byte bytSignal, byte bytStatus) {

            System.arraycopy(bytsSSID, 0, ssid, 0, bytsSSID.length);
            mode = bytMode;
            enctype = bytEnctype;
            signal = bytSignal;
            status = bytStatus;
        }
    }

    public class SMsgAVIoctrlListWifiApResp {
        int number; // MAX: 1024/36= 28
        SWifiAp stWifiAp;
    }

    public static class SMsgAVIoctrlSetWifiReq {
        byte[] ssid = new byte[32];
        byte[] password = new byte[32];
        byte mode;
        byte enctype;
        byte[] reserved = new byte[10];

        public static byte[] parseContent(byte[] ssid, byte[] password, byte mode, byte enctype) {

            byte[] result = new byte[76];

            System.arraycopy(ssid, 0, result, 0, ssid.length);
            System.arraycopy(password, 0, result, 32, password.length);
            result[64] = mode;
            result[65] = enctype;

            return result;
        }
    }

    public class SMsgAVIoctrlSetWifiResp {
        byte result;
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlGetWifiReq {

        static byte[] reserved = new byte[4];

        public static byte[] parseContent() {
            return reserved;
        }
    }


    public class SMsgAVIoctrlGetWifiResp {
        byte[] ssid = new byte[32];
        byte[] password = new byte[32];
        byte mode;
        byte enctype;
        byte signal;
        byte status;
    }

    public static class SMsgAVIoctrlSetRecordReq {
        int channel; // Camera Index
        int recordType;
        byte[] reserved = new byte[4];

        public static byte[] parseContent(int channel, int recordType) {

            byte[] result = new byte[12];
            byte[] ch = Packet.intToByteArray_Little(channel);
            byte[] type = Packet.intToByteArray_Little(recordType);

            System.arraycopy(ch, 0, result, 0, 4);
            System.arraycopy(type, 0, result, 4, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlSetRecordResp {
        byte result;
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlGetRecordReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent(int channel) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlGetRecordResp {
        int channel; // Camera Index
        int recordType;
    }

    public class SMsgAVIoctrlSetRcdDurationReq {
        int channel; // Camera Index
        int presecond;
        int durasecond;
    }

    public class SMsgAVIoctrlSetRcdDurationResp {
        byte result;
        byte[] reserved = new byte[3];
    }

    public class SMsgAVIoctrlGetRcdDurationReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];
    }

    public class SMsgAVIoctrlGetRcdDurationResp {
        int channel; // Camera Index
        int presecond;
        int durasecond;
    }

    public static class STimeDay {

        private byte[] mBuf;
        public short year;
        public byte month;
        public byte day;
        public byte wday;
        public byte hour;
        public byte minute;
        public byte second;

        public STimeDay(byte[] data) {

            mBuf = new byte[8];
            System.arraycopy(data, 0, mBuf, 0, 8);

            year = Packet.byteArrayToShort_Little(data, 0);
            month = data[2];
            day = data[3];
            wday = data[4];
            hour = data[5];
            minute = data[6];
            second = data[7];
        }

        public STimeDay(byte[] data, int offset) {

            mBuf = new byte[8];
            System.arraycopy(data, offset, mBuf, 0, 8);

            year = Packet.byteArrayToShort_Little(data, offset);
            month = data[2 + offset];
            day = data[3 + offset];
            wday = data[4 + offset];
            hour = data[5 + offset];
            minute = data[6 + offset];
            second = data[7 + offset];
        }

        public long getTimeInMillis() {

            Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            cal.set(year, month - 1, day, hour, minute, second);

            return cal.getTimeInMillis();
        }

        public String getLocalTime() {

            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            calendar.setTimeInMillis(getTimeInMillis());
            // calendar.add(Calendar.MONTH, -1);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            dateFormat.setTimeZone(TimeZone.getDefault());

            return dateFormat.format(calendar.getTime());
        }

        public String getTime() {

            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            calendar.setTimeInMillis(getTimeInMillis());
            // calendar.add(Calendar.MONTH, -1);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            dateFormat.setTimeZone(TimeZone.getTimeZone("gmt"));

            return dateFormat.format(calendar.getTime());
        }

        public byte[] toByteArray() {
            return mBuf;
        }

        public static byte[] parseContent(int year, int month, int day, int wday, int hour, int minute, int second) {

            byte[] result = new byte[8];

            byte[] y = Packet.shortToByteArray_Little((short) year);
            System.arraycopy(y, 0, result, 0, 2);

            result[2] = (byte) month;
            result[3] = (byte) day;
            result[4] = (byte) wday;
            result[5] = (byte) hour;
            result[6] = (byte) minute;
            result[7] = (byte) second;

            return result;
        }
    }

    public static class SMsgAVIoctrlListEventReq {

        int channel; // Camera Index
        byte[] startutctime = new byte[8];
        byte[] endutctime = new byte[8];
        byte event;
        byte status;
        byte[] reversed = new byte[2];

        public static byte[] parseConent(int channel, long startutctime, long endutctime, byte event, byte status) {

            Calendar startCal = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            Calendar stopCal = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            startCal.setTimeInMillis(startutctime);
            stopCal.setTimeInMillis(endutctime);

            System.out.println("search from " + startCal.get(Calendar.YEAR) + "/" + startCal.get(Calendar.MONTH) + "/" + startCal.get(Calendar.DAY_OF_MONTH)
                    + " " + startCal.get(Calendar.HOUR_OF_DAY) + ":" + startCal.get(Calendar.MINUTE) + ":" + startCal.get(Calendar.SECOND));
            System.out.println("       to   " + stopCal.get(Calendar.YEAR) + "/" + stopCal.get(Calendar.MONTH) + "/" + stopCal.get(Calendar.DAY_OF_MONTH) + " "
                    + stopCal.get(Calendar.HOUR_OF_DAY) + ":" + stopCal.get(Calendar.MINUTE) + ":" + stopCal.get(Calendar.SECOND));

            byte[] result = new byte[24];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            byte[] start = STimeDay.parseContent(startCal.get(Calendar.YEAR), startCal.get(Calendar.MONTH) + 1, startCal.get(Calendar.DAY_OF_MONTH),
                    startCal.get(Calendar.DAY_OF_WEEK), startCal.get(Calendar.HOUR_OF_DAY), startCal.get(Calendar.MINUTE), 0);
            System.arraycopy(start, 0, result, 4, 8);

            byte[] stop = STimeDay.parseContent(stopCal.get(Calendar.YEAR), stopCal.get(Calendar.MONTH) + 1, stopCal.get(Calendar.DAY_OF_MONTH),
                    stopCal.get(Calendar.DAY_OF_WEEK), stopCal.get(Calendar.HOUR_OF_DAY), stopCal.get(Calendar.MINUTE), 0);
            System.arraycopy(stop, 0, result, 12, 8);

            result[20] = event;
            result[21] = status;

            return result;
        }
    }

    public static class SAvEvent {
        byte[] utctime = new byte[8];
        byte event;
        byte status;
        byte[] reserved = new byte[2];

        public static int getTotalSize() {
            return 12;
        }
    }

    public class SMsgAVIoctrlListEventResp {
        int channel; // Camera Index
        int total;
        byte index;
        byte endflag;
        byte count;
        byte reserved;
        SAvEvent stEvent;
    }

    public static class SMsgAVIoctrlPlayRecord {
        int channel; // Camera Index
        int command; // play record command
        int Param;
        byte[] stTimeDay = new byte[8];
        byte[] reserved = new byte[4];

        public static byte[] parseContent(int channel, int command, int param, long time) {

            byte[] result = new byte[24];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            byte[] cmd = Packet.intToByteArray_Little(command);
            System.arraycopy(cmd, 0, result, 4, 4);

            byte[] p = Packet.intToByteArray_Little(param);
            System.arraycopy(p, 0, result, 8, 4);

            Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            cal.setTimeInMillis(time);
            cal.add(Calendar.DAY_OF_MONTH, -1);
            cal.add(Calendar.DATE, 1);
            byte[] timedata = STimeDay.parseContent(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),
                    cal.get(Calendar.DAY_OF_WEEK), cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
            System.arraycopy(timedata, 0, result, 12, 8);

            return result;
        }

        public static byte[] parseContent(int channel, int command, int param, byte[] time) {

            byte[] result = new byte[24];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            byte[] cmd = Packet.intToByteArray_Little(command);
            System.arraycopy(cmd, 0, result, 4, 4);

            byte[] p = Packet.intToByteArray_Little(param);
            System.arraycopy(p, 0, result, 8, 4);

            System.arraycopy(time, 0, result, 12, 8);

            return result;
        }
    }

    // only for play record start command
    public class SMsgAVIoctrlPlayRecordResp {
        int channel;
        int result;
        byte[] reserved = new byte[4];
    } // only for play record start command

    public class SMsgAVIoctrlEvent {
        STimeDay stTime; // 8 bytes
        int channel; // Camera Index
        int event; // Event Type
        byte[] reserved = new byte[4];
    }

    public static class SMsgAVIoctrlSetVideoModeReq {
        int channel; // Camera Index
        byte mode; // Video mode
        byte[] reserved = new byte[3];

        public static byte[] parseContent(int channel, byte mode) {
            byte[] result = new byte[8];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            result[4] = mode;

            return result;
        }
    }

    public class SMsgAVIoctrlSetVideoModeResp {
        int channel; // Camera Index
        byte result; // 1 - succeed, 0 - failed
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlGetVideoModeReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent(int channel) {
            byte[] result = new byte[8];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlGetVideoModeResp {
        int channel; // Camera Index
        byte mode; // Video Mode
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlSetEnvironmentReq {
        int channel; // Camera Index
        byte mode; // Environment mode
        byte[] reserved = new byte[3];

        public static byte[] parseContent(int channel, byte mode) {

            byte[] result = new byte[8];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            result[4] = mode;

            return result;
        }
    }

    public class SMsgAVIoctrlSetEnvironmentResp {

        int channel; // Camera Index
        byte result; // 1 - succeed, 0 - failed
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlGetEnvironmentReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent(int channel) {

            byte[] result = new byte[8];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlGetEnvironmentResp {
        int channel; // Camera Index
        byte mode; // Environment Mode
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlFormatExtStorageReq {

        int storage; // Storage index (ex. sdcard slot = 0, internal flash = 1,
        // ...)
        byte[] reserved = new byte[4];

        public static byte[] parseContent(int storage) {

            byte[] result = new byte[8];

            byte[] ch = Packet.intToByteArray_Little(storage);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlFormatExtStorageResp {

        int storage; // Storage index
        byte result; // 0: success;
        // -1: format command is not supported.
        // otherwise: failed.

        byte[] reserved = new byte[3];
    }

    public static class SStreamDef {

        public int index; // the stream index of camera
        public int channel; // the channel index used in AVAPIs

        public SStreamDef(byte[] data) {

            index = Packet.byteArrayToShort_Little(data, 0);
            channel = Packet.byteArrayToShort_Little(data, 2);
        }

        public String toString() {
            return ("CH" + String.valueOf(index + 1));
        }
    }

    public static class SMsgAVIoctrlGetSupportStreamReq {

        public static byte[] parseContent() {

            return new byte[4];
        }

        public static int getContentSize() {
            return 4;
        }
    }

    public class SMsgAVIoctrlGetSupportStreamResp {

        public SStreamDef mStreamDef[];
        public long number;
    }

    public static class SMsgAVIoctrlGetAudioOutFormatReq {

        public static byte[] parseContent() {
            return new byte[8];
        }
    }

    public class SMsgAVIoctrlGetAudioOutFormatResp {
        public int channel;
        public int format;
    }

    //IOTYPE_USER_IPCAM_GET_FLOWINFO_REQ              = 0x390
    public static class SMsgAVIoctrlGetFlowInfoReq {
        public int channel;
        public int collect_interval;

    }

    //IOTYPE_USER_IPCAM_GET_FLOWINFO_RESP            = 0x391
    public static class SMsgAVIoctrlGetFlowInfoResp {
        public int channel;
        public int collect_interval;

        public static byte[] parseContent(int channel, int collect_interval) {

            byte[] result = new byte[8];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            byte[] col = Packet.intToByteArray_Little(collect_interval);
            System.arraycopy(col, 0, result, 4, 4);

            return result;
        }
    }

    // IOTYPE_USER_IPCAM_CURRENT_FLOWINFO              = 0x392
    public static class SMsgAVIoctrlCurrentFlowInfo {
        public int channel;
        public int total_frame_count;
        public int lost_incomplete_frame_count;
        public int total_expected_frame_size;
        public int total_actual_frame_size;
        public int elapse_time_ms;

        public static byte[] parseContent(int channel, int total_frame_count, int lost_incomplete_frame_count, int total_expected_frame_size, int total_actual_frame_size, int elapse_time_ms) {

            byte[] result = new byte[32];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            byte[] total_frame = Packet.intToByteArray_Little(total_frame_count);
            System.arraycopy(total_frame, 0, result, 4, 4);

            byte[] lost_incomplete = Packet.intToByteArray_Little(lost_incomplete_frame_count);
            System.arraycopy(lost_incomplete, 0, result, 8, 4);

            byte[] total_expected = Packet.intToByteArray_Little(total_expected_frame_size);
            System.arraycopy(total_expected, 0, result, 12, 4);

            byte[] total_actual = Packet.intToByteArray_Little(total_actual_frame_size);
            System.arraycopy(total_actual, 0, result, 16, 4);

            byte[] elapse_time = Packet.intToByteArray_Little(elapse_time_ms);
            System.arraycopy(elapse_time, 0, result, 20, 4);

            return result;
        }
    }

    /* IOTYPE_USER_IPCAM_GET_TIMEZONE_REQ               = 0x3A0
     * IOTYPE_USER_IPCAM_GET_TIMEZONE_RESP              = 0x3A1
     * IOTYPE_USER_IPCAM_SET_TIMEZONE_REQ               = 0x3B0
     * IOTYPE_USER_IPCAM_SET_TIMEZONE_RESP              = 0x3B1
     */
    public static class SMsgAVIoctrlTimeZone {
        public int cbSize;
        public int nIsSupportTimeZone;
        public int nGMTDiff;
        public byte[] szTimeZoneString = new byte[256];

        public SMsgAVIoctrlTimeZone(byte[] byt) {
            int pos = 0;
            this.cbSize = Packet.byteArrayToInt_Little(byt, pos);
            pos += 4;
            this.nIsSupportTimeZone = Packet.byteArrayToInt_Little(byt, pos);
            pos += 4;
            this.nGMTDiff = Packet.byteArrayToInt_Little(byt, pos);
            pos += 4;
            System.arraycopy(byt, pos, this.szTimeZoneString, 0, 256);
        }

        public static byte[] parseContent() {

            return new byte[268];
        }

        public static byte[] parseContent(int cbSize, int nIsSupportTimeZone, int nGMTDiff, byte[] szTimeZoneString) {

            byte[] result = new byte[12 + 256];

            byte[] size = Packet.intToByteArray_Little(cbSize);
            System.arraycopy(size, 0, result, 0, 4);

            byte[] isSupportTimeZone = Packet.intToByteArray_Little(nIsSupportTimeZone);
            System.arraycopy(isSupportTimeZone, 0, result, 4, 4);

            byte[] GMTDiff = Packet.intToByteArray_Little(nGMTDiff);
            System.arraycopy(GMTDiff, 0, result, 8, 4);

            System.arraycopy(szTimeZoneString, 0, result, 12, szTimeZoneString.length);

            return result;
        }
    }

    //dropbox-------------------------------------------------------
    public static final int IOTYPE_USEREX_IPCAM_SET_DROPBOX_ACCESS_TOKEN_REQ = 0x4013;
    //Data:SMsgAVIoctrlExSetDropboxAccessTokenReq

    public static final int IOTYPE_USEREX_IPCAM_SET_DROPBOX_ACCESS_TOKEN_RESP = 0x4014;
    //Data: SMsgAVIoctrlExSetDropboxAccessTokenResp

    public static final int IOTYPE_USEREX_IPCAM_GET_DROPBOX_ACCESS_TOKEN_REQ = 0x4015;
    //Data:SMsgAVIoctrlExGetDropboxAccessTokenReq

    public static final int IOTYPE_USEREX_IPCAM_GET_DROPBOX_ACCESS_TOKEN_RESP = 0x4016;
    //Data: SMsgAVIoctrlExGetDropboxAccessTokenResp

    //IOTYPE_USEREX_IPCAM_SET_DROPBOX_ACCESS_TOKEN_REQ
    //IOTYPE_USEREX_IPCAM_GET_DROPBOX_ACCESS_TOKEN_RESP
    public static class SMsgAVIoctrlExSetDropboxAccessTokenReq {
        public byte[] a_tok = new byte[32];
        public byte[] a_sec = new byte[32];
    }

    public static class SMsgAVIoctrlExGetDropboxAccessTokenResp {
        public byte[] a_tok = new byte[32];
        public byte[] a_sec = new byte[32];
    }

    //IOTYPE_USEREX_IPCAM_SET_DROPBOX_ACCESS_TOKEN_RESP
    public static class SMsgAVIoctrlExSetDropboxAccessTokenResp {
        public int status; //0: success; otherwise: failed
    }

    //IOTYPE_USEREX_IPCAM_GET_DROPBOX_ACCESS_TOKEN_REQ
    //IOTYPE_USEREX_IPCAM_SET_NETSTORAGE_ENABLED_RESP
    public static class SMsgAVIoctrlExGetDropboxAccessTokenReq {
        static byte[] reserved = new byte[4];

        public static byte[] parseContent() {

            return reserved;
        }
    }

    public static class SMsgAVIoctrlExSetNetStorageEnabledResp {
        public byte[] reserved = new byte[4];
    }

    public static final int IOTYPE_USEREX_IPCAM_SET_NETSTORAGE_ENABLED_REQ = 0x4017;
    //Data: SMsgAVIoctrlExSetNetStorageEnabledReq

    public static final int IOTYPE_USEREX_IPCAM_SET_NETSTORAGE_ENABLED_RESP = 0x4018;
    //Data: SMsgAVIoctrlExSetNetStorageEnabledResp

    //IOTYPE_USEREX_IPCAM_SET_NETSTORAGE_ENABLED_REQ
    public static class SMsgAVIoctrlExSetNetStorageEnabledReq {
        public int en;
    }

    public static final int IOTYPE_USEREX_IPCAM_GET_NETSTORAGE_REQ = 0x4019;
    //Data: SMsgAVIoctrlExGetNetStorageReq

    public static final int IOTYPE_USEREX_IPCAM_GET_NETSTORAGE_RESP = 0x401a;
    //Data: SMsgAVIoctrlExGetNetStorageResp

    public static final int IOTYPE_USEREX_IPCAM_SET_NETSTORAGE_REQ = 0x401b;
    //Data: SMsgAVIoctrlExSetNetStorageReq

    public static final int IOTYPE_USEREX_IPCAM_SET_NETSTORAGE_RESP = 0x401c;
    //Data: SMsgAVIoctrlExSetNetStorageResp

    public static class SMsgAVIoctrlExSetNetStorageReq {
        public int enable;
        public byte[] proto = new byte[16];    //cifs, nfs, ftp, dropbox
        public byte[] host_ip = new byte[64];
        public byte[] ap = new byte[48];    //shared name(cifs) / path(nfs) / subdir(ftp) / ...
        public byte[] account = new byte[64];
        public byte[] password = new byte[64];

        public static byte[] parseContent(int enable) {
            byte[] result = new byte[4 + 16 + 64 + 48 + 64 + 64];

            byte[] enableByte = Packet.intToByteArray_Little(enable);
            System.arraycopy(enableByte, 0, result, 0, 4);

            return result;
        }

        public static byte[] parseContent(int enable, String protoString, String accountString, String passwordString) {
            byte[] result = new byte[4 + 16 + 64 + 48 + 64 + 64];

            byte[] enableByte = Packet.intToByteArray_Little(enable);
            System.arraycopy(enableByte, 0, result, 0, 4);

            System.arraycopy(protoString.getBytes(), 0, result, 4, protoString.getBytes().length);
            System.arraycopy(accountString.getBytes(), 0, result, 4 + 16 + 64 + 48, accountString.getBytes().length);
            System.arraycopy(passwordString.getBytes(), 0, result, 4 + 16 + 64 + 48 + 64, passwordString.getBytes().length);

            return result;
        }
    }

    public static class SMsgAVIoctrlExGetNetStorageResp {
        public int enable;
        public byte[] proto = new byte[16];    //cifs, nfs, ftp, dropbox
        public byte[] host_ip = new byte[64];
        public byte[] ap = new byte[48];    //shared name(cifs) / path(nfs) / subdir(ftp) / ...
        public byte[] account = new byte[64];
        public byte[] password = new byte[64];

        public static byte[] parseContent() {
            return new byte[4 + 16 + 64 + 48 + 64 + 64];
        }
    }
    /* [proto] can be:
     *    "cifs":
	 *            host_ip:  ip or host of CIFS server
	 *            ap:       Shared name
	 *            account/password:
	 *    "nfs":
	 *            host_ip:  ip or host of NFS server
	 *            ap:       Path
	 *            account/password:
	 *    "ftp":
	 *            host_ip:  ip or host of FTP server
	 *            ap:       Sub-directory, can be EMPTY
	 *            account/password:
	 *    "dropbox":
	 *            host_ip:  EMPTY
	 *            ap:       EMPTY
	 *            account/password:  access_token/access_secret pair
	 */


    /**
     * 以下为报警邮箱设置相关的接口
     */
    public static final int IOTYPE_USEREX_IPCAM_GET_SMTP_REQ = 0x4005;
    //Data: SMsgAVIoctrlExGetSmtpReq

    public static final int IOTYPE_USEREX_IPCAM_GET_SMTP_RESP = 0x4006;
    //Data: SmtpSetting

    public static final int IOTYPE_USEREX_IPCAM_SET_SMTP_REQ = 0x4007;
    //Data: SmtpSetting

    public static final int IOTYPE_USEREX_IPCAM_SET_SMTP_RESP = 0x4008;
    //Data: SMsgAVIoctrlExSetSmtpResp

    public static final int IOTYPE_USEREX_IPCAM_SEND_TEST_MAIL_REQ = 0x4009;
    //Data: SMsgAVIoctrlExSendMailReq
    public static final int IOTYPE_USEREX_IPCAM_SEND_TEST_MAIL_RESP = 0x400A;
    //Data: SMsgAVIoctrlExSendMailResp

    public static final int IOTYPE_USEREX_IPCAM_GET_MAIL_STATUS_REQ = 0x400B;
    //Data: SMsgAVIoctrlExGetMailStatusReq
    public static final int IOTYPE_USEREX_IPCAM_GET_MAIL_STATUS_RESP = 0x400C;
    //Data: SMsgAVIoctrlExGetMailStatusResp

	/*public static class SmtpSetting{
        public int  enable;
		public byte[] smtp_svr = new byte[64];
		public int	 smtp_port;
		public byte[] user = new byte[32];
		public byte[] password = new byte[32];
		public byte[] sender = new byte[64];
		public byte[] receiver = new byte[64];
		
		public static byte[] parseContent(int enable) {
			byte[] result = new byte[4+64+4+32+32+64+64];
			
			byte[] enableByte = Packet.intToByteArray_Little(enable);
			System.arraycopy(enableByte, 0, result, 0, 4);
			
			return result;
		}
		public static byte[] parseContent(int enable,String smtpServerString,int smtpPort,String userString,String passwordString) {
			byte[] result = new byte[4+64+4+32+32+64+64];
			
			byte[] enableByte = Packet.intToByteArray_Little(enable);
			System.arraycopy(enableByte, 0, result, 0, 4);
			
			System.arraycopy(smtpServerString.getBytes(), 0, result, 4, smtpServerString.getBytes().length);
			
			byte[] portByte = Packet.intToByteArray_Little(smtpPort);
			System.arraycopy(portByte, 0, result, 4+64, 4);
			
			System.arraycopy(userString.getBytes(), 0, result, 4+64+4, userString.getBytes().length);
			System.arraycopy(passwordString.getBytes(), 0, result, 4+64+4+32, passwordString.getBytes().length);
			System.arraycopy(userString.getBytes(), 0, result, 4+64+4+32+32, userString.getBytes().length);
			System.arraycopy(userString.getBytes(), 0, result, 4+64+4+32+32+64, userString.getBytes().length);
			
			return result;
		}
	}*/

    public static class SmtpSetting {
        public int enable;
        public byte[] smtp_svr = new byte[64];
        public int smtp_port;
        public byte[] user = new byte[32];
        public byte[] password = new byte[32];
        public byte[] sender = new byte[64];
        public byte[] receiver = new byte[64];
        public int ssl;

        public SmtpSetting() {
        }

        public SmtpSetting(byte[] byt) {

            int pos = 0;
            this.enable = Packet.byteArrayToInt_Little(byt, pos);
            pos += 4;
            System.arraycopy(byt, pos, this.smtp_svr, 0, 64);
            pos += 64;
            this.smtp_port = Packet.byteArrayToInt_Little(byt, pos);
            pos += 4;
            System.arraycopy(byt, pos, this.user, 0, 32);
            pos += 32;
            System.arraycopy(byt, pos, this.password, 0, 32);
            pos += 32;
            System.arraycopy(byt, pos, this.sender, 0, 64);
            pos += 64;
            System.arraycopy(byt, pos, this.receiver, 0, 64);
            pos += 64;
            this.ssl = Packet.byteArrayToInt_Little(byt, pos);
        }

        public static byte[] parseContent(int enable) {
            byte[] result = new byte[4 + 64 + 4 + 32 + 32 + 64 + 64 + 4];

            byte[] enableByte = Packet.intToByteArray_Little(enable);
            System.arraycopy(enableByte, 0, result, 0, 4);

            return result;
        }

        public static byte[] parseContent(int enable, String smtpServerString, int smtpPort, String userString, String passwordString, String receive, int ssl) {
            byte[] result = new byte[4 + 64 + 4 + 32 + 32 + 64 + 64 + 4];

            byte[] enableByte = Packet.intToByteArray_Little(enable);
            System.arraycopy(enableByte, 0, result, 0, 4);//enable 0-4

            System.arraycopy(smtpServerString.getBytes(), 0, result, 4, smtpServerString.getBytes().length);//smtp_svr 4-4+64

            byte[] portByte = Packet.intToByteArray_Little(smtpPort);
            System.arraycopy(portByte, 0, result, 4 + 64, 4); //port 4+64-4+64+4

            System.arraycopy(userString.getBytes(), 0, result, 4 + 64 + 4, userString.getBytes().length);//user   4+64+4--4+64+4+32
            System.arraycopy(passwordString.getBytes(), 0, result, 4 + 64 + 4 + 32, passwordString.getBytes().length);//password 4+64+4+32--4+64+4+32+32
            System.arraycopy(userString.getBytes(), 0, result, 4 + 64 + 4 + 32 + 32, userString.getBytes().length);//sender  4+64+4+32+32-4+64+4+32+32+64
            System.arraycopy(receive.getBytes(), 0, result, 4 + 64 + 4 + 32 + 32 + 64, receive.getBytes().length);//receiver  4+64+4+32+32+64-4+64+4+32+32+64+64
            byte[] sslByte = Packet.intToByteArray_Little(ssl);
            System.arraycopy(sslByte, 0, result, 4 + 64 + 4 + 32 + 32 + 64 + 64, 4);
            /*if (ssl != 0) {
                byte[] sslByte = Packet.intToByteArray_Little(ssl);
				System.arraycopy(userString.getBytes(), 0, result, 4+64+4+32+32+64+64, 4);
			}*/

            return result;
        }
    }

    public static class SMsgAVIoctrlExGetSmtpReq {
        public byte[] reserved = new byte[64];

        public static byte[] parseContent() {
            return new byte[64];
        }
    }

    public static class SMsgAVIoctrlExSendMailReq {
        public byte[] reserved = new byte[64];

        public static byte[] parseContent() {
            return new byte[64];
        }
    }

    public static class SMsgAVIoctrlExGetMailStatusReq {
        public byte[] reserved = new byte[64];

        public static byte[] parseContent() {
            return new byte[64];
        }
    }

    /**
     * 以下为传感器相关的接口
     */
    public static final int IOTYPE_USEREX_IPCAM_GET_HUMITURE_REQ = 0x6001;
    //Data: SMsgAVIoctrlExGetSmtpReq

    public static final int IOTYPE_USEREX_IPCAM_GET_HUMITURE_RESP = 0x6002;

    public static class SMsgAVIoctrlExGetHumiTureResp {
        public int temperature;   // 温度值   ex: temperature/100.temperature%100
        public int humidity;      // 湿度值   ex: humidity/100.humidity%100
        public int pm;            // PM2.5
        public byte[] receiver = new byte[24];
    }

    public static class SMsgAVIoctrlExGetHumiTureReq {
        static byte[] reserved = new byte[4];

        public static byte[] parseContent() {
            return reserved;
        }
    }


    //led相关
    public static final int IOTYPE_USER_IPCAM_SETALARMRING_REQ = 0x44E;
    public static final int IOTYPE_USER_IPCAM_SETALARMRING_RESP = 0x44F;
    public static final int IOTYPE_USER_IPCAM_GETALARMRING_REQ = 0x8030;
    //Data: SMsgAVIoctrlExGetSmtpReq

    public static final int IOTYPE_USER_IPCAM_GETALARMRING_RESP = 0x8031;

    public static class SMsgAVIoctrlGetAlarmRingResp {
        int nOn; // ON=1,OFF=0
    }

    public static class SMsgAVIoctrlGetAlarmRingReq {
        int channel; // Camera Index

        public static byte[] parseContent(int channel) {
            byte[] result = new byte[4];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);
            return result;
        }
    }

    public static class SMsgAVIoctrlSetAlarmRingResp {
        public int result;            // 0:success; otherwise: failed;
        public byte[] receiver = new byte[4];
    }

    public static class SMsgAVIoctrlSetAlarmRingReq {
        int channel; // Camera Index
        int nOn; // ON=1,OFF=0

        public static byte[] parseContent(int channel, int nOn) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            byte[] on = Packet.intToByteArray_Little(nOn);
            System.arraycopy(ch, 0, result, 0, 4);
            System.arraycopy(on, 0, result, 4, 4);
            return result;
        }
    }

    /***user-define protocol,附加的协议***/
/*
IOTYPE_USER_IPCAM_GET_PRESET_LIST_REQ	= 0x2001,
IOTYPE_USER_IPCAM_GET_PRESET_LIST_RESP = 0x2002,
** @struct SMsgAVIoctrlGetPreListResp
*/
    public static class SMsgAVIoctrlPointInfo {
        public int BitID;  //值为-1时，自动分配ID。>=0 指定ID
        public byte[] Desc;//32byte

        public SMsgAVIoctrlPointInfo(byte[] data) {
            this.BitID = Packet.byteArrayToInt_Little(data, 0);
            this.Desc = new byte[32];
            System.arraycopy(data, 4, this.Desc, 0, this.Desc.length);
        }

        public static byte[] parseContent(int BitID, String strDesc) {
            byte[] result = new byte[36];
            byte[] bitId = Packet.intToByteArray_Little(BitID);
            byte[] desc = strDesc.getBytes();
            System.arraycopy(bitId, 0, result, 0, 4);
            System.arraycopy(desc, 0, result, 4, desc.length);
            return result;
        }
    }

    public static class SMsgAVIoctrlGetPreListResp {
        int channel;        // Camera Index
        int total;        // Total event amount in this search session
        byte index;
        byte endflag;        // end flag; endFlag = 1 means this package is the last one.
        public byte PointsCount;        // how much events in this package
        byte[] reserved;
        public SMsgAVIoctrlPointInfo[] Points;        // The first memory address of the events in this package

        public SMsgAVIoctrlGetPreListResp(byte[] data) {
            if (data.length >= 40) {
                this.channel = Packet.byteArrayToInt_Little(data, 0);
                this.total = Packet.byteArrayToInt_Little(data, 4);
                this.index = data[8];
                this.endflag = data[9];
                this.PointsCount = data[10];
                this.reserved = new byte[]{data[11]};
                this.Points = new SMsgAVIoctrlPointInfo[this.PointsCount > 0 ? this.PointsCount : 0];
                int i = 0;
                while (i < PointsCount && data.length >= 12 + (i + 1) * 36) {
                    byte[] p = new byte[36];
                    System.arraycopy(data, 12 + i * 36, p, 0, p.length);
                    this.Points[i] = new SMsgAVIoctrlPointInfo(p);
                    i++;
                }
            }
        }

        public static byte[] parseContent(int BitID, String strDesc) {
            byte[] result = new byte[36];
            byte[] bitId = Packet.intToByteArray_Little(BitID);
            byte[] desc = strDesc.getBytes();
            System.arraycopy(bitId, 0, result, 0, 4);
            System.arraycopy(desc, 0, result, 4, desc.length);
            return result;
        }
    }


/*
IOTYPE_USER_IPCAM_SET_PRESET_POINT_REQ = 0x2003,
IOTYPE_USER_IPCAM_SET_PRESET_POINT_RESP = 0x2004,
** @struct SMsgAVIoctrlSetPointReq
** @struct SMsgAVIoctrlSetPointResp
*/


    public static class SMsgAVIoctrlSetPointResp {
        int result;    // 0: success; otherwise: failed.

        byte[] reserved;//size:4

        public SMsgAVIoctrlSetPointResp(byte[] data) {
            result = Packet.byteArrayToInt_Little(data, 0);
            reserved = new byte[4];
            System.arraycopy(data, 4, reserved, 0, reserved.length);
        }
    }



    /*
    IOTYPE_USER_IPCAM_OPR_PRESET_POINT_REQ = 0x2005,
    IOTYPE_USER_IPCAM_OPR_PRESET_POINT_RESP = 0x2006,
    ** @struct SMsgAVIoctrlPointOprReq
     **@struct SMsgAVIoctrlPointOprResp
    */

    public static class SMsgAVIoctrlPointOprReq {
        int Type;    //0-调用预置点，1-清除单个预置点，2-清除所有预置点
        int BitID;//预置点序号

        public SMsgAVIoctrlPointOprReq(byte[] data) {
            Type = Packet.byteArrayToInt_Little(data, 0);
            BitID = Packet.byteArrayToInt_Little(data, 4);
        }

        public static byte[] parseContent(int BitID, int Type) {
            byte[] result = new byte[8];
            byte[] bitId = Packet.intToByteArray_Little(BitID);
            byte[] type = Packet.intToByteArray_Little(Type);
            System.arraycopy(type, 0, result, 0, 4);
            System.arraycopy(bitId, 0, result, 4, bitId.length);
            return result;
        }
    }

    public static class SMsgAVIoctrlPointOprResp {
        int result;    // 0: success; otherwise: failed.

        byte[] reserved;//size:4

        public SMsgAVIoctrlPointOprResp(byte[] data) {
            result = Packet.byteArrayToInt_Little(data, 0);
            reserved = new byte[4];
            System.arraycopy(data, 4, reserved, 0, reserved.length);
        }
    }

    /*daylight saving time
    IOTYPE_USER_IPCAM_GET_DST_REQ = 0x2007,
    IOTYPE_USER_IPCAM_GET_DST_RESP = 0x2008,
    @struct SMsgAVIoctrlDstResp

    IOTYPE_USER_IPCAM_SET_DST_REQ = 0x2009,
    IOTYPE_USER_IPCAM_SET_DST_RESP = 0x200A,
    ** @struct SMsgAVIoctrlDstReq
    */

    public static class SMsgAVIoctrlDstSet {
        int DstEn;    //0-no use daylight saving time,1-use daylight saving time,-1-自动选择

        public SMsgAVIoctrlDstSet(byte[] data) {
            DstEn = Packet.byteArrayToInt_Little(data, 0);
        }

        public static byte[] parseContent(int DstEn) {
            byte[] result = new byte[4];
            byte[] dst = Packet.intToByteArray_Little(DstEn);
            System.arraycopy(dst, 0, result, 0, 4);
            return result;
        }
    }

    /*
    IOTYPE_USER_IPCAM_REBOOT_REQ = 0x200B,
    IOTYPE_USER_IPCAM_REBOOT_RESP = 0x200C,
    IOTYPE_USER_IPCAM_RESET_DEFAULT_REQ = 0x200D,
    IOTYPE_USER_IPCAM_RESET_DEFAULT_RESP = 0x200E,
    ** @struct SMsgAVIoctrlRusultResp
    */
    public static class SMsgAVIoctrlRusultResp {
        public int result;    // 0: success; otherwise: failed.

        byte[] reserved;//size:4

        public SMsgAVIoctrlRusultResp(byte[] data) {
            result = Packet.byteArrayToInt_Little(data, 0);
            reserved = new byte[4];
            System.arraycopy(data, 4, reserved, 0, reserved.length);
        }

    }

    public static class SMsgAVIoctrlGetUpgradeResp {
        public byte[] localUrl;//128 bytes 局域网路径
        public byte[] upgradeUrl;//128 bytes 外网路径
        public byte[] systemType;//128 bytes system.dat,usr.dat,web.dat的存放路径
        public byte[] customType;//128 bytes custom.dat存放路径
        public byte[] vendorType;//128 bytes vendor.dat存放路径

        public SMsgAVIoctrlGetUpgradeResp(byte[] data) {
            if (data.length >= 640) {
                this.localUrl = new byte[128];
                this.upgradeUrl = new byte[128];
                this.systemType = new byte[128];
                this.customType = new byte[128];
                this.vendorType = new byte[128];
                int i = 0;
                System.arraycopy(data, i, this.localUrl, 0, 128);
                i += 128;
                System.arraycopy(data, i, this.upgradeUrl, 0, 128);
                i += 128;
                System.arraycopy(data, i, this.systemType, 0, 128);
                i += 128;
                System.arraycopy(data, i, this.customType, 0, 128);
                i += 128;
                System.arraycopy(data, i, this.vendorType, 0, 128);
            }
        }
    }

    //web.dat,system.dat,usr.dat版本号，校验码
    public static class SMsgAVIoctrlSystemDatInfo {
        public byte[] version;    //32bytes 依次是web.system.usr
        public byte[] usrcheck;    //32bytes usr.dat检验码
        public byte[] systemcheck;    //32bytes system.dat校验码
        public byte[] webcheck;        //32bytes web.dat检验码

        public static byte[] parseContent(String ver, String usrchk, String syschk, String webchk) {
            byte[] result = new byte[128];
            byte[] btsVer = ver.getBytes();
            byte[] btsUsrChk = usrchk.getBytes();
            byte[] btsSyschk = syschk.getBytes();
            byte[] btsWebchk = webchk.getBytes();
            System.arraycopy(btsVer, 0, result, 0, btsVer.length);
            System.arraycopy(btsUsrChk, 0, result, 32, btsUsrChk.length);
            System.arraycopy(btsSyschk, 0, result, 64, btsSyschk.length);
            System.arraycopy(btsWebchk, 0, result, 96, btsWebchk.length);
            return result;
        }

    }

    //custom.dat 版本号，校验码
    public static class SMsgAVIoctrlCustomDatInfo {
        public byte[] version;    //32bytes 依次是web.system.usr
        public byte[] customcheck;    //32bytes custom.dat检验码

        public static byte[] parseContent(String ver, String customchk) {
            byte[] result = new byte[64];
            byte[] btsVer = ver.getBytes();
            byte[] btsCustomchk = customchk.getBytes();
            System.arraycopy(btsVer, 0, result, 0, btsVer.length);
            System.arraycopy(btsCustomchk, 0, result, 32, btsCustomchk.length);
            return result;
        }

    }

    //vendor.dat 版本号，校验码
    public static class SMsgAVIoctrlVendorDatInfo {
        public byte[] version;    //32bytes 依次是web.system.usr
        public byte[] vendorcheck;    //32bytes vendor.dat检验码

        public static byte[] parseContent(String ver, String chk) {
            byte[] result = new byte[64];
            byte[] btsVer = ver.getBytes();
            byte[] btsChk = chk.getBytes();
            System.arraycopy(btsVer, 0, result, 0, btsVer.length);
            System.arraycopy(btsChk, 0, result, 32, btsChk.length);
            return result;
        }
    }

    //vendor.dat 版本号，校验码
    public static class SMsgAVIoctrlSetUpgradeReq {
        int SerType;   //0-远程服务器，1-本地服务器
        SMsgAVIoctrlSystemDatInfo SystemInfo;//system.dat,web.dat,usr.dat版本和校验码信息
        SMsgAVIoctrlCustomDatInfo CustomInfo;//custom.dat版本和校验码信息
        SMsgAVIoctrlVendorDatInfo VendorInfo;//vendor.dat版本和校验码信息

        public static byte[] parseContent(int serType, byte[] btsSysInfo, byte[] btsCustomInfo, byte[] btsVendorInfo) {
            byte[] result = new byte[4 + 128 + 64 + 64];
            byte[] btsSerType = Packet.intToByteArray_Little(serType);
            int i = 0;
            System.arraycopy(btsSerType, 0, result, i, btsSerType.length);
            i += 4;
            System.arraycopy(btsSysInfo, 0, result, i, btsSysInfo.length);
            i += 128;
            System.arraycopy(btsCustomInfo, 0, result, i, btsCustomInfo.length);
            i += 64;
            System.arraycopy(btsVendorInfo, 0, result, i, btsVendorInfo.length);
            return result;
        }
    }

    //vendor.dat 版本号，校验码
    public static class SMsgAVIoctrlUpgradeStatus {
        public int ret;    //升级过程，暂时未用到，目前返回都是610
        public int p;      //percent,升级百分比

        public SMsgAVIoctrlUpgradeStatus(byte[] data) {
            if (data.length >= 8) {
                ret = Packet.byteArrayToInt_Little(data, 0);
                p = Packet.byteArrayToInt_Little(data, 4);
            }
        }
    }

    public static class SMsgAVIoctrlFirmwareInfoResp {
        byte[] firmwareVer; //32bytes

        public SMsgAVIoctrlFirmwareInfoResp(byte[] data) {
            if (data.length >= 32) {
                firmwareVer = data;
            }
        }
    }

    public static class SMsgAVIoctrlSetUpgradeResp {
        public int result;    // 0: success; otherwise: failed.

        byte[] reserved;//size:4

        public SMsgAVIoctrlSetUpgradeResp(byte[] data) {
            result = Packet.byteArrayToInt_Little(data, 0);
            reserved = new byte[4];
            System.arraycopy(data, 4, reserved, 0, reserved.length);
        }
    }

    //    public static final int IOTYPE_USER_IPCAM_GET_TIME_INFO_REQ = 0x2024;
//    public static final int IOTYPE_USER_IPCAM_GET_TIME_INFO_RESP = 0x2025;
//    public static final int IOTYPE_USER_IPCAM_SET_TIME_INFO_REQ = 0x2026;
//    public static final int IOTYPE_USER_IPCAM_SET_TIME_INFO_RESP = 0x2027;
    public static class SMsgAVIoctrlTime {
        //0-格林威治时间，1-本地时间，作为设置时，目前不支持本地时间设置设备时间
        public int timeType;

        public STimeDay timeInfo; //8bytes 时间
        public int adjustFlg;    //是否已经校过时，用于测试两台设备时间相差的问题。

        public int ntpEnable;    //网络自动校时
        public byte[] ntpServ;  //[128 bytes] NTP校时地址
        public byte[] reserve;    //

        public SMsgAVIoctrlTime(byte[] data) {
            int pos = 0;
            timeType = Packet.byteArrayToInt_Little(data, 0);
            pos += 4;
            timeInfo = new STimeDay(data, pos);
            pos += 8;
            adjustFlg = Packet.byteArrayToInt_Little(data, pos);
            pos += 4;
            ntpEnable = Packet.byteArrayToInt_Little(data, pos);
            pos += 4;
            ntpServ = new byte[128];
            System.arraycopy(data, pos, ntpServ, 0, ntpServ.length);
        }

        public static byte[] parseContent(byte[] timeInfo_, int ntpEnable_, String ntpServ_, int adjustFlg_) {
            byte[] result = new byte[156];
            int pos = 4;
            System.arraycopy(timeInfo_, 0, result, pos, 8);
            pos += 8;
            System.arraycopy(Packet.intToByteArray_Little(adjustFlg_), 0, result, pos, 4);
            pos += 4;
            System.arraycopy(Packet.intToByteArray_Little(ntpEnable_), 0, result, pos, 4);
            pos += 4;
            System.arraycopy(ntpServ_.getBytes(), 0, result, pos, ntpServ_.getBytes().length);
            pos += 128;
            return result;
        }
    }

    public static class SMsgAVIoctrlGetTimeReq {
        int reqTimeType;    //0-格林威治时间，1-本地时间

        public static byte[] parseContent(boolean isGmtTime) {
            byte[] result = new byte[4];
            int pos = 0;
            System.arraycopy(Packet.intToByteArray_Little(isGmtTime ? 0 : 1), 0, result, pos, 4);
            return result;
        }
    }

    public static class SMsgAVIoctrlTZoneInfo {
        public byte[] dstDistId;//[64]; //夏令时地区标识，与上述列表中第一个元素匹配。
        public byte[] timeZoneDesc;//[32]; //时区文字描述
        public int isdst;            //当前时区是否采用夏令时


        public SMsgAVIoctrlTZoneInfo(byte[] data) {
            dstDistId = new byte[64];
            timeZoneDesc = new byte[32];
            System.arraycopy(data, 0, dstDistId, 0, 64);
            System.arraycopy(data, 64, timeZoneDesc, 0, 32);
            isdst = Packet.byteArrayToInt_Little(data, 96);
        }

        public static byte[] parseContent(String dstDistId, String timezoneDesc, int isDst) {
            byte[] result = new byte[100];
            byte[] bytsDst = dstDistId.getBytes();
            System.arraycopy(bytsDst, 0, result, 0, bytsDst.length);
            byte[] bytsTimezone = timezoneDesc.getBytes();
            System.arraycopy(bytsTimezone, 0, result, 64, bytsTimezone.length);
            System.arraycopy(Packet.intToByteArray_Little(isDst), 0, result, 96, 4);
            return result;
        }
    }

    public static class SMsgAVIoctrlGetTZoneResp {
        public SMsgAVIoctrlTZoneInfo dstDistrictInfo;
        public int enable;     //是否自动调整夏令时开关


        public SMsgAVIoctrlGetTZoneResp(byte[] data) {
            dstDistrictInfo = new SMsgAVIoctrlTZoneInfo(data);
            enable = Packet.byteArrayToInt_Little(data, 100);
        }
    }

    public static class SMsgAVIoctrlSetTZoneReq {
        byte[] dstDistId;     //64bytes地区标识
        int enable;     //是否自动调整夏令时开关


        public static byte[] parseContent(String dstDistId, int enableDst) {
            byte[] result = new byte[68];
            byte[] bytsDst = dstDistId.getBytes();
            System.arraycopy(bytsDst, 0, result, 0, bytsDst.length);
            System.arraycopy(Packet.intToByteArray_Little(enableDst), 0, result, 64, 4);
            return result;
        }
    }

    public static class SMsgAVIoctrlUpdateWifiStatus {
        public byte[] ssid;        //32bytes 连接的无线的ssid
        public int status;            //ENUM_WIRELESS_STATUS   0:AVIOTC_WIRELESS_SETTING_OK, 1:AVIOTC_WIRELESS_SETTING_FAIL , 2:AVIOTC_WIRELESS_PASSWD_ERROR

        public SMsgAVIoctrlUpdateWifiStatus(byte[] data) {
            ssid = new byte[32];
            System.arraycopy(data, 0, ssid, 0, 32);
            status = Packet.byteArrayToInt_Little(data, 32);
        }
    }


    //aoni

    /**
     * 设备信息
     */
    public static class SMsgAVIoctrlDevModelConfig {

        public SMsgAVIoctrlDevModelConfig(byte[] data) {
            if (data != null && data.length >= 132) {
                System.arraycopy(data, 0, this.deviceModel, 0, 64);
                System.arraycopy(data, 64, this.manufacturer, 0, 64);
                this.serverMask = Packet.byteArrayToInt_Little(data, 128);
            }
        }

        public boolean hasMic() {
            return (this.serverMask & 0x01) > 0;
        }

        public boolean hasSpeak() {
            return (this.serverMask & 0x02) > 0;
        }

        public boolean hasIOAlarm() {
            return (this.serverMask & 0x04) > 0;
        }

        public boolean hasSDCard() {
            return (this.serverMask & 0x08) > 0;
        }

        public boolean hasPtz() {
            return (this.serverMask & 0x10) > 0;
        }

        public byte[] deviceModel = new byte[64];    //设备型号
        public byte[] manufacturer = new byte[64];    //制造商
        int serverMask;            //位数说明(0:mic 1:speak 2:wifi 3:I/O输入输出报警 4:SD卡录像 5:云台) 该位1有效，0无效。
        public byte[] reserved = new byte[4];            //保留
        public byte[] serverMaskBytes = new byte[4];            //保留

    }
    //录像时长设置，单位second
//    IOTYPE_USER_IPCAM_SETRCD_DURATION_REQ	= 0x0314,
//    IOTYPE_USER_IPCAM_GETRCD_DURATION_RESP  = 0x0317,

    public static class SMsgAVIoctrlRcdDuration {

        public SMsgAVIoctrlRcdDuration(byte[] data) {
            if (data != null && data.length >= 12) {
                this.channel = Packet.byteArrayToInt_Little(data, 0);
                this.presecond = Packet.byteArrayToInt_Little(data, 4);
                this.durasecond = Packet.byteArrayToInt_Little(data, 8);
            }
        }

        public static byte[] parseContent(int durasecond) {
            byte[] data = new byte[12];
            byte[] dbyte = Packet.intToByteArray_Little(durasecond);
            System.arraycopy(dbyte, 0, data, 8, 4);
            return data;
        }

        public int channel;        // Camera Index
        public int presecond;    // pre-recording (sec)   936不支持
        public int durasecond;    // recording (sec)		最大请勿超过300秒


    }


    public static class SMsgAVIoctrlListEventReq_Ausdom {
        public int year;
        public int month;
        public int day;
        public byte type;        //ENUM_RECORD_TYPE
        byte[] res = new byte[3];

        public SMsgAVIoctrlListEventReq_Ausdom(int year, int month, int day, byte type) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.type = type;
        }


        public static byte[] parseConent(int year, int month, int day, byte type) {
            byte[] data = new byte[16];
            System.arraycopy(Packet.intToByteArray_Little(year), 0, data, 0, 4);
            System.arraycopy(Packet.intToByteArray_Little(month), 0, data, 4, 4);
            System.arraycopy(Packet.intToByteArray_Little(day), 0, data, 8, 4);
            data[12] = type;
            return data;
        }
    }

    public static class SAvEvent_Ausdom {
        STimeDay stTime;
        byte event;
        byte[] reserved = new byte[3];

        public static int getTotalSize() {
            return 12;
        }

    }

    public class SMsgAVIoctrlListEventResp_Ausdom {
        int channel; // Camera Index
        int total;
        byte index;
        byte endflag;
        byte count;
        byte type;
        SAvEvent_Ausdom stEvent;        // The first memory address of the events in this package
//	int videotime[MAX_VIDEO_NUM];  //max is 100

    }

    //IOTYPE_USER_IPCAM_GET_BAT_PRAM_REQ
    public static class SMsgGetBatPramResp {
        public int work_mode;
        // 0:bat; 1:usb无电池；2:usb有电池，充电中；3:usb有电池，充电满
        public int bat_percent;    //当前电池电量百分比
        byte[] reserved = new byte[4];

        public SMsgGetBatPramResp(byte[] data) {
            if (data.length >= 8) {
                this.work_mode = Packet.byteArrayToInt_Little(data, 0);
                this.bat_percent = Packet.byteArrayToInt_Little(data, 4);
            }
        }

    }

    //IOTYPE_USER_IPCAM_SET_BAT_PUSH_EN_REQ			= 0X400A3,
//IOTYPE_USER_IPCAM_SET_BAT_PUSH_EN_RESP			= 0X400A4,
//IOTYPE_USER_IPCAM_GET_BAT_PUSH_EN_REQ			= 0X400A5,
//IOTYPE_USER_IPCAM_GET_BAT_PUSH_EN_RESP			= 0X400A6,

    public static class SMsgAVIoctrlBatPush {
        public int push_en;
        byte[] reserved = new byte[4];

        public SMsgAVIoctrlBatPush(byte[] data) {
            if (data.length >= 8) {
                this.push_en = Packet.byteArrayToInt_Little(data, 0);
            }
        }

        public static byte[] parseContent(int enable) {
            byte[] data = new byte[8];
            System.arraycopy(Packet.intToByteArray_Little(enable), 0, data, 0, 4);
            return data;
        }

    }

//IOTYPE_USER_IPCAM_SET_DB_PUSH_EN_REQ				= 0X400A7,
//IOTYPE_USER_IPCAM_SET_DB_PUSH_EN_RESP			= 0X400A8,
//IOTYPE_USER_IPCAM_GET_DB_PUSH_EN_REQ				= 0X400A9,
//IOTYPE_USER_IPCAM_GET_DB_PUSH_EN_RESP			= 0X400AA,


    public static class SMsgAVIoctrlDbPush {
        public int push_en;
        byte[] reserved = new byte[4];

        public SMsgAVIoctrlDbPush(byte[] data) {
            if (data.length >= 8) {
                this.push_en = Packet.byteArrayToInt_Little(data, 0);
            }
        }

        public static byte[] parseContent(int enable) {
            byte[] data = new byte[8];
            System.arraycopy(Packet.intToByteArray_Little(enable), 0, data, 0, 4);
            return data;
        }
    }

    // AUSDOM REMOTE UPGRADE  升级请求
//IOTYPE_USER_IPCAM_REMOTE_UPGRADE_REQ   = 0X6008E,
//IOTYPE_USER_IPCAM_REMOTE_UPGRADE_RESP   = 0X6008F,
    public static class SMsgAVIoctrlRemoteUpgradeReq {
        byte[] new_version = new byte[64];  //即将升级的产品版本号
        byte[] url_parth = new byte[128];    //升级文件存放的服务器地址

        public static byte[] parseContent(String newVersion, String path) {
            byte[] data = new byte[192];
            try {
                byte[] newVerBytes = newVersion.getBytes("utf-8");
                byte[] pathBytes = path.getBytes("utf-8");
                if (newVerBytes.length < 64) {
                    System.arraycopy(newVerBytes, 0, data, 0, newVerBytes.length);
                }
                if (pathBytes.length < 128) {
                    System.arraycopy(pathBytes, 0, data, 64, pathBytes.length);
                }
                return data;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return data;
        }
    }

    public static class SMsgAVIoctrlRemoteUpgradeResp {
        public int result;   //0 : 可以升级 1:当前已经是最新版本，无需升级   -1:正在升级中
        byte[] reserved = new byte[4];

        public SMsgAVIoctrlRemoteUpgradeResp(byte[] data) {
            if (data.length >= 4) {
                this.result = Packet.byteArrayToInt_Little(data, 0);
            }
        }
    }

    //IOTYPE_USER_IPCAM_UPGRADE_PROGRESS_REQ  = 0X60090,
//IOTYPE_USER_IPCAM_UPGRADE_PROGRESS_RESP  = 0X60091,

    public static class SMsgAVIoctrlProgressResp {
        public int progress_value;   //升级进度 :0~100  表示升级进度   -1:正在升级中
        byte[] reserved = new byte[4];

        public SMsgAVIoctrlProgressResp(byte[] data) {
            if (data.length >= 4) {
                this.progress_value = Packet.byteArrayToInt_Little(data, 0);
            }
        }
    }

    //    IOTYPE_USER_IPCAM_SET_PIR_SENSITIVITY_REQ   = 0X6000c, //PIR SENSITIVITY
//    IOTYPE_USER_IPCAM_SET_PIR_SENSITIVITY_RESP = 0X6000d,
//    IOTYPE_USER_IPCAM_GET_PIR_SENSITIVITY_REQ = 0X6000e,
//    IOTYPE_USER_IPCAM_GET_PIR_SENSITIVITY_RESP  = 0X6000f,
    //[0~19]
//[20~39]
//        [40~59]
//        [60~79]
//        [80~99]
//        100
    public static class SMsgPirSensitivity {
        public int sensitivity;   //0-100
        byte[] reserved = new byte[4];

        public SMsgPirSensitivity(byte[] data) {
            if (data.length >= 4) {
                this.sensitivity = Packet.byteArrayToInt_Little(data, 0);
            }
        }

        public static byte[] parseContent(int sens) {
            byte[] result = new byte[8];
            System.arraycopy(Packet.intToByteArray_Little(sens), 0, result, 0, 4);
            return result;
        }
    }

    //    PIR开关：
//    IOTYPE_USER_IPCAM_SET_ARM_STATUS_REQ        = 0X60008, // ARM/DISARM
//    IOTYPE_USER_IPCAM_SET_ARM_STATUS_RESP       = 0X60009,
//    IOTYPE_USER_IPCAM_GET_ARM_STATUS_REQ        = 0X6000a,
//    IOTYPE_USER_IPCAM_GET_ARM_STATUS_RESP       = 0X6000b,
    public static class SMsgArmEnable {
        public int arm_enable;   //1:enable 0:disable
        byte[] reserved = new byte[4];

        public SMsgArmEnable(byte[] data) {
            if (data.length >= 4) {
                this.arm_enable = Packet.byteArrayToInt_Little(data, 0);
            }
        }

        public static byte[] parseContent(boolean enable) {
            byte[] result = new byte[8];
            System.arraycopy(Packet.intToByteArray_Little(enable ? 1 : 0), 0, result, 0, 4);
            return result;
        }
    }

    /*
    IOTYPE_USER_IPCAM_SET_NTP_CONFIG_REQ		= 0X40050,	//写入ntp的配置信息
    IOTYPE_USER_IPCAM_SET_NTP_CONFIG_RESP		= 0X40051,
    IOTYPE_USER_IPCAM_GET_NTP_CONFIG_REQ		= 0X40052,	//读取ntp的配置信息
    IOTYPE_USER_IPCAM_GET_NTP_CONFIG_RESP		= 0X40053,

    */
    public static class Ntp_set_time {
        public int year;
        public int month;
        public int date;

        public int hour;
        public int minute;
        public int second;

        public Ntp_set_time(byte[] data) {
            if (data.length >= 24) {
                this.year = Packet.byteArrayToInt_Little(data, 0);
                this.month = Packet.byteArrayToInt_Little(data, 4);
                this.date = Packet.byteArrayToInt_Little(data, 8);
                this.hour = Packet.byteArrayToInt_Little(data, 12);
                this.minute = Packet.byteArrayToInt_Little(data, 16);
                this.second = Packet.byteArrayToInt_Little(data, 20);
            }
        }

        public Ntp_set_time() {
        }

        public Ntp_set_time(byte[] data, int beginPos) {
            if (data.length >= 24 + beginPos) {
                this.year = Packet.byteArrayToInt_Little(data, 0 + beginPos);
                this.month = Packet.byteArrayToInt_Little(data, 4 + beginPos);
                this.date = Packet.byteArrayToInt_Little(data, 8 + beginPos);
                this.hour = Packet.byteArrayToInt_Little(data, 12 + beginPos);
                this.minute = Packet.byteArrayToInt_Little(data, 16 + beginPos);
                this.second = Packet.byteArrayToInt_Little(data, 20 + beginPos);
            }
        }

        public static byte[] parseContent(int year, int month, int date, int hour, int minute, int second) {
            byte[] result = new byte[24];
            System.arraycopy(Packet.intToByteArray_Little(year), 0, result, 0, 4);
            System.arraycopy(Packet.intToByteArray_Little(month), 0, result, 4, 4);
            System.arraycopy(Packet.intToByteArray_Little(date), 0, result, 8, 4);
            System.arraycopy(Packet.intToByteArray_Little(hour), 0, result, 12, 4);
            System.arraycopy(Packet.intToByteArray_Little(minute), 0, result, 16, 4);
            System.arraycopy(Packet.intToByteArray_Little(second), 0, result, 20, 4);
            return result;
        }

        public byte[] parseContent() {
            byte[] result = new byte[24];
            System.arraycopy(Packet.intToByteArray_Little(year), 0, result, 0, 4);
            System.arraycopy(Packet.intToByteArray_Little(month), 0, result, 4, 4);
            System.arraycopy(Packet.intToByteArray_Little(date), 0, result, 8, 4);
            System.arraycopy(Packet.intToByteArray_Little(hour), 0, result, 12, 4);
            System.arraycopy(Packet.intToByteArray_Little(minute), 0, result, 16, 4);
            System.arraycopy(Packet.intToByteArray_Little(second), 0, result, 20, 4);
            return result;
        }
    }

    public static class SMsgAVIoctrlNtpConfig {
        public int mod;     ///1,ntp 2 manul
        public byte[] Server = new byte[32];//NTP Server:
        public Ntp_set_time time;//manul time
        public byte TimeZone;//TimeZone:  0~25:(GMT-12)~GMT~(GMT+12)

        public SMsgAVIoctrlNtpConfig(byte[] data) {
            if (data.length >= 24) {
                this.mod = Packet.byteArrayToInt_Little(data, 0);
                System.arraycopy(data, 4, this.Server, 0, 32);
                this.time = new Ntp_set_time(data, 36);
                this.TimeZone = data[60];
            }
        }

        public static byte[] parseContent(int mod, String server, Ntp_set_time time, byte timeZone) {
            byte[] result = new byte[61];
            System.arraycopy(Packet.intToByteArray_Little(mod), 0, result, 0, 4);
            byte[] serverByts = server.getBytes();
            System.arraycopy(serverByts, 0, result, 4, serverByts.length);
            byte[] timeByts = time.parseContent();
            System.arraycopy(timeByts, 0, result, 36, timeByts.length);
            result[60] = timeZone;
            return result;
        }

        public byte[] parseContent() {
            byte[] result = new byte[61];
            System.arraycopy(Packet.intToByteArray_Little(mod), 0, result, 0, 4);
            System.arraycopy(Server, 0, result, 4, Server.length);
            byte[] timeByts = time.parseContent();
            System.arraycopy(timeByts, 0, result, 36, timeByts.length);
            result[60] = TimeZone;
            return result;
        }
    }

}
