package com.library.manage.common;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Constants {
    public static final int SUCCESS = 200;
    public static final int FAIL = -1;
    public static final String DELETED = "deleted";
    public static final String RUNNING = "running";
    public static int OK = 0;
    public static final String TRADE = "TRADE";
    public static final String I_PROVISION = "i_provision";
    public static final String OS_KEY_ENTRY = "entry";
    public static final String OS_KEY_ERRINFO = "osKeyErrInfo";
    public static final String INS_REQUEST_ID = "request_id";
    public static final String INS_REQUEST_ID_FLAG = "request_id";
    public static final String INS_REQUEST_STATUS_FLAG = "code";
    public static final String INS_ERRORCODE_FLAG = "errorcode";
    public static final String INS_ERRORTXT_FLAG = "errortxt";
    public static final String INS_CODE_SECCUSS_FLAG = "0";
    public static final String INSTRUCT_INTF_COMMAND = "command";
    public static final String INSTRUCT_INTF_RESPONSE = "response";
    public static final String INSTRUCT_QUERY_NAME = "queryAsyncJobResult";
    public static final String INSTRUCT_RESPONSE_MODE_JSON = "json";
    public static final String INSTRUCT_IPVS_ID = "ipvsId";
    public static final String INSTRUCT_DEPEND_ID = "dependId";
    public static final String INSTRUCT_DEPEND_MAP = "denpendMap";
    public static final String ERROR_SUFFIX = "_error";
    public static final String SPLIT_CHAR = "&";
    public static final String DEFAULT_AZ = "defaultAZ";
    public static final String DEPENDENCE_ID = "-1";
    public static final int PS_STATUS_INIT = 0;
    public static final int PS_STATUS_SEND_RMQ_SUCCESS = 1;
    public static final int PS_STATUS_SEND_RMQ_FAIL = 11;
    public static final int PS_STATUS_SUCCESS = 2;
    public static final int PS_STATUS_FALSE = 3;
    public static final int PS_STATUS_DEPD_FALSE = 5;
    public static final int PS_STATUS_COMPING = 6;
    public static final int PS_STATUS_SUCCESS_COMP_SUCCESS = 7;
    public static final int PS_STATUS_COMP_FLASE = 8;
    public static final int PS_STATUS_FALSE_COMP_SUCCESS = 9;
    public static final int PS_STATUS_SYNC_JOB_COMP = 10;
    public static final int PS_STATUS_ASYNC_JOB_COMP = 20;
    public static final int PS_STATUS_ORDER_RMQ_ERROR = 12;
    public static final String SYN_TABLE = "__INTERNAL_SYNTABLE";
    public static final String TN_UCS_CUSTOMER = "UCS_CUSTOMER";
    public static final String TN_UCS_SUBSCRIPTION = "UCS_SUBSCRIPTION";
    public static final String TN_UCS_SUBS_COMPONENT = "UCS_SUBS_COMPONENT";
    public static final String TN_UCS_SUBS_MU_PRTY = "UCS_SUBS_MU_PRTY";
    public static final String TN_UCS_SUBS_RELATION = "UCS_SUBS_RELATION";
    public static final String TN_RES_ID = "RES_IP";
    public static final String TN_UCS_ACCOUNT = "UCS_ACCOUNT";
    public static final String TN_UCS_SUBS_GIFT = "UCS_SUBS_GIFT";
    public static final String TN_UCS_SUBS_GIFT_PROPERTY = "UCS_SUBS_GIFT_PROPERTY";
    public static final String TN_UCS_SUBS_SCHEME = "UCS_SUBS_SCHEME";
    public static final String TN_UCS_SUBS_SCHEME_PRTY = "UCS_SUBSCHEME_PRTY";
    public static final String PRE_COMPELET_JUGE = "COMPELET_JUGE.";
    public static final String GEN_QUERY = "GEN_QUERY.";
    public static final String TAB_COMPELET_UCS = "TAB_COMPELET_UCS.";
    public static final String ORDER_COMPLETE = "ORDER_COMPLETE.";
    public static final String ORDER_DEAL = "ORDER_DEAL.";
    public static final String TRAVEL_TIGGER = "TRAVEL_TIGGER.";
    public static final String WORK_FLOW_HANDLE = "WORK_FLOW_HANDLE.";
    public static final int ONLINE_TEST = 2;
    public static final int ONLINE_UP = 0;
    public static final int ONLINE_DOWN = 1;
    public static final int ONLINE_INTERNAL = 3;
    public static final int[] ONLINE_BILL_TEST = new int[]{0, 3, 5};
    public static final int[] ONLINE_BILL_UP = new int[]{0, 3};
    public static final int[] ONLINE_BILL_DOWN = new int[]{5};
    public static final int[] ONLINE_BILL_INTERNAL = new int[]{0, 3, 5};
    public static final int BILL_MONTH = 0;
    public static final int BILL_HOUR = 1;
    public static final int BILL_DAY = 2;
    public static final int BILL_YEAR = 3;
    public static final int BILL_VOLUM = 4;
    public static final int BILL_DOWN = 5;
    public static final int BILL_FREE = 5;
    public static Pattern PATTERN_EMAIL = Pattern.compile("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+", 2);
    public static final String ACTIVE_CLIENTAPP_URL = "http://localhost:8080/plantformclient/UserManage?";
    public static final int TOKEN_LIFE_CYCLE = 1440;
    public static final String TRADE_INFO = "__INTERNAL_TRADEINFO";
    public static final String TRADE_RETURN = "__INTERNAL_TRADERETURN";
    public static final Map orderDeviceCountList = new HashMap<String, String>() {
        {
            this.put("1006", "getIp");
            this.put("1003", "getLoadbalance");
            this.put("1008", "getRouter");
            this.put("1015", "getClouddesktop");
            this.put("1002", "getVolumeQuota");
        }
    };
    public static final Map orderDevicePrtyList = new HashMap<String, String>() {
        {
            this.put("1001", "cpuNum=getCpu,memorySize=getMem,osDisk=getStorageQuota");
            this.put("1016", "cpunumber=getCpu,memory=getMem,disksize=getStorageQuota");
            this.put("1002", "storageSize=getDisksize");
            this.put("1006", "BAND_WIDTH=getBandwidth");
        }
    };
    public static final int SERVICE_TYPE_VM = 1001;
    public static final int SERVICE_TYPE_VOLUME = 1002;
    public static final int SERVICE_TYPE_LOADBLANCE = 1003;
    public static final int SERVICE_TYPE_OBJECTSTORAGE = 1012;
    public static final int SERVICE_TYPE_FILESTORAGE = 1013;
    public static final int SERVICE_TYPE_PUBLICNETWORK = 1006;
    public static final int SERVICE_TYPE_SKYNET = 1007;
    public static final int SERVICE_TYPE_ROUTER = 1008;
    public static final int SERVICE_TYPE_SUBNET = 1009;
    public static final int SERVICE_TYPE_SECURITY = 1010;
    public static final int SERVICE_TYPE_CLOUDTAB = 1015;
    public static final int SERVICE_TYPE_PM = 1016;
    public static final int SERVICE_TYPE_SNAPSHOT = 1017;
    public static final int SERVICE_TYPE_IMAGE = 1018;
    public static final int SERVICE_TYPE_VOLUMEBACKUP = 1020;
    public static final int SERVICE_TYPE_VOLUMEBACKUP_TASK = 1021;
    public static final int SERVICE_TYPE_OBSBACKUP = 1023;
    public static final int SERVICE_TYPE_OBSBACKUP_TASK = 1024;
    public static final int SERVICE_TYPE_NASBACKUP = 1025;
    public static final int SERVICE_TYPE_NASBACKUP_TASK = 1026;
    public static final int SERVICE_TYPE_DBZHCZ = 5055;
    public static final int SERVICE_TYPE_APPVM = 8104;
    public static final int SERVICE_TYPE_ANTIVIRUS = 8008;
    public static final int SERVICE_TYPE_GIFT = 8888;
    public static final int SERVICE_TYPE_NETWORK_CARD = 8211;
    public static final int SERVICE_TYPE_LOADBLANCE_HEALTH_MONITOR = 9009;
    public static final int SERVICE_TYPE_NETWORK_SCANNER = 2001;
    public static final int SERVICE_TYPE_CLOUD_BACKUP = 1030;
    public static final int SERVICE_TYPE_CLOUDANTIVIRUS = 2002;
    public static final int SERVICE_TYPE_CLOUDFIREWALL = 2003;
    public static final int SERVICE_TYPE_CLOUDWEBPROTECT = 2004;
    public static final int SERVICE_TYPE_CLOUDDEFINDER = 2005;
    public static final int SERVICE_TYPE_RDS = 1830;
    public static final int SERVICE_TYPE_RDS_USER = 1832;
    public static final int SERVICE_TYPE_RDS_DATABASE = 1831;
    public static final int SERVICE_TYPE_DEDLINE = 1027;
    public static final int SERVICE_TYPE_CERTIFICATE = 2500;
    public static final int SERVICE_TYPE_RDS_BACKUP = 1838;
    public static final int SERVICE_TYPE_SSHKEY = 4567;
    public static final int SERVICE_TYPE_VPN = 1101;
    public static final int SERVICE_TYPE_PHY_LB = 1201;
    public static final int SERVICE_TYPE_PHY_LB_HEALTH = 1202;
    public static final int SERVICE_TYPE_PHY_LB_CERT = 1203;
    public static final int SERVICE_TYPE_PHY_ROUTER = 1301;
    public static final int SERVICE_TYPE_PHY_FW = 1401;
    public static final int SERVICE_TYPE_PHY_FW_STRATEGY = 1402;
    public static final int SERVICE_TYPE_PHY_FW_RULE = 1403;
    public static final Map<Integer, Integer> BACKUP_SERVICE_TYPE = new HashMap<Integer, Integer>() {
        {
            this.put(1002, 1020);
            this.put(1012, 1023);
            this.put(1013, 1025);
        }
    };
    public static final Map<Integer, String> BACKUP_TYPE = new HashMap<Integer, String>() {
        {
            this.put(1002, "volumeid");
            this.put(1013, "volumeid");
            this.put(1012, "volumeid");
        }
    };
    public static final int TRADE_INIT = 0;
    public static final int TRADE_DEALING = 1;
    public static final int TRADE_NOPAY = 2;
    public static final int TRADE_FAIL = 4;
    public static final int TRADE_CANCEL = 7;
    public static final int TRADE_PAYED = 8;
    public static final int TRADE_SUCCESS = 9;
    public static final String[] TRADE_STATUS_DESC = new String[]{"初始化", "处理中", "未支付", "3", "失败", "5", "6", "撤销", "已支付", "完成"};
    public static final int SERVICE_INIT = 0;
    public static final int SERVICE_OPEN = 1;
    public static final int SERVICE_STOP = 2;
    public static final int SERVICE_DEL = 4;
    public static final String SUB_SERVICE_RUNNING = "running";
    public static final String SUB_SERVICE_PENDING = "pending";
    public static final String SUB_SERVICE_REJECT = "reject";
    public static final String SUB_SERVICE_OPENING = "opening";
    public static final String SUB_SERVICE_CHANGING = "changing";
    public static final String SUB_SERVICE_RESTTINF = "restting";
    public static final String SUB_SERVICE_DELETING = "deleting";
    public static final String SUB_SERVICE_DELETED = "deleted";
    public static final String SUB_SERVICE_CLOSING = "closing";
    public static final String SUB_SERVICE_CLOSED = "closed";
    public static final String SUB_SERVICE_USED = "using";
    public static final String SUB_SERVICE_ERROR = "error";
    public static final String SUB_SERVICE_BINDING = "binding";
    public static final String SUB_SERVICE_UNBINDING = "unbinding";
    public static final String SUB_SERVICE_PWD_RESETTING = "pwdresetting";
    public static final String SUB_SERVICE_LIMITING = "limiting";
    public static final String SUB_SERVICE_COMPLETE = "complete";
    public static final String SUB_SERVICE_SCANNING = "scanning";
    public static final String SUB_SERVICE_HOSTRESTORE = "hostrestoring";
    public static final String SUB_SERVICE_NOTOPEN = "notopen";
    public static final String SERVICE_PRODUCT_ERROR_DEPLOY_VM = "deploy error";
    public static final String SERVICE_PRODUCT_ERROR_START_VM = "start error";
    public static final String SERVICE_PRODUCT_ERROR_STOP_VM = "stop error";
    public static final String SERVICE_PRODUCT_ERROR_REBOOT_VM = "reboot error";
    public static final String SERVICE_PRODUCT_ERROR_DESTROY_VM = "destory error";
    public static final String SERVICE_PRODUCT_ERROR_PAUSE_VM = "pause error";
    public static final String SERVICE_PRODUCT_ERROR_UNPAUSE_VM = "unpause error";
    public static final String SERVICE_PRODUCT_ERROR_SUSPEND_VM = "suspend error";
    public static final String SERVICE_PRODUCT_ERROR_RESUME_VM = "resume error";
    public static final String SERVICE_PRODUCT_ERROR_MIGRATE_VM = "migrate error";
    public static final String SERVICE_PRODUCT_ERROR_RESETPASSWORD_VM = "resetpassword error";
    public static final String SERVICE_PRODUCT_ERROR_CREATE = "create error";
    public static final String SERVICE_PRODUCT_ERROR_DELETE = "delete error";
    public static final String SERVICE_PRODUCT_ERROR_UPDATE = "update error";
    public static final String SERVICE_PRODUCT_ERROR_ATTACH = "attach error";
    public static final String SERVICE_PRODUCT_ERROR_DETACH = "detach error";
    public static final String SERVICE_PRODUCT_ERROR_ADD = "add error";
    public static final String SERVICE_PRODUCT_ERROR_REMOVE = "remove error";
    public static final String SERVICE_PRODUCT_ERROR_BIND = "bind error";
    public static final String SERVICE_PRODUCT_ERROR_UNBIND = "unbind error";
    public static final String SERVICE_PRODUCT_ERROR_APPLY = "apply error";
    public static final String SERVICE_PRODUCT_ERROR_CHANGE = "change error";
    public static final String SERVICE_PRODUCT_ERROR_CLOUD_BACKUP = "cloud backup error";
    public static final String SERVICE_PRODUCT_ERROR_CLOUD_BACKUP_PATH = "cloud backup path error";
    public static final String OPT_STATE_STOPPING = "stopping";
    public static final String OPT_STATE_STARTING = "starting";
    public static final String OPT_STATE_RESETTING = "resetting";
    public static final String OPT_STATE_ATTACHING = "attaching";
    public static final String OPT_STATE_UNATTACHING = "unattaching";
    public static final String OPT_STATE_XKSTOPPING = "xkstopping";
    public static final String OPT_STATE_SNAPING = "snaping";
    public static final String OPT_STATE_RECOVERING = "recovering";
    public static final String OPT_STATE_MIGRATEING = "migrateing";
    public static final String OPT_STATE_COPYING = "copying";
    public static final String OPT_STATE_SCANNING = "scanning";
    public static final String OPT_STATE_BACKUPING = "backuping";
    public static final String SUB_SERVICE_GRANTING = "granting";
    public static final String SUB_SERVICE_REVOKING = "revoking";
    public static final String RESOUSE_POOL_HUHEHAOTE = "huhehaote";
    public static final String RESOUSE_POOL_LANGFANG = "langfang";
    public static final int CFG_COMPLETE_TYPE_SUNS = 0;
    public static final int CFG_COMPLETE_TYPE_RELA = 1;
    public static final int CFG_COMPLETE_TYPE_MUPRTY = 2;
    public static final int CFG_COMPLETE_TYPE_MIDSTATUS = 3;
    public static final int CFG_COMPLETE_TYPE_SPERELA = 4;
    public static final int CFG_COMPLETE_TYPE_CHANGE = 5;
    public static final int CFG_COMPLETE_TYPE_SNAPSHOT = 6;
    public static final int CFG_COMPLETE_TYPE_PRODUCTPROPERTY = 7;
    public static final int RELA_VM_PN = 0;
    public static final int RELA_VM_LB = 1;
    public static final int RELA_VM_SN = 2;
    public static final int RELA_VM_EBS = 3;
    public static final int RELA_ROUTER_SN = 4;
    public static final int RELA_ROUTER_PN = 5;
    public static final int RELA_ROUTER_RU = 6;
    public static final int RELA_LB_SN = 7;
    public static final int RELA_LB_VIP = 8;
    public static final int RELA_LB_BM = 9;
    public static final int RELA_VM_SECURITY = 10;
    public static final int RELA_SECURITY_MEMBER = 11;
    public static final int RELA_PM_PN = 12;
    public static final int RELA_VM_ACTIVIRUS = 13;
    public static final int RELA_VOLUME_TASK = 14;
    public static final int RELA_VM_CARD = 15;
    public static final int RELA_NETWORKCARDS_SECURITY = 16;
    public static final int RELA_NET_SUBNET = 17;
    public static final int RELA_CLOUDTAB_USER = 18;
    public static final int RELA_LB_LBHEALTHMONITOR = 19;
    public static final int RELA_PM_SN = 20;
    public static final int RELA_SCANNER_SN = 21;
    public static final int RELA_SCANNER_VSR = 22;
    public static final int RELA_CLOUD_BACKUP_TASK = 23;
    public static final int RELA_SECURITY = 24;
    public static final int RELA_CACHE_SN = 25;
    public static final int RELA_RDS_SN = 26;
    public static final int RELA_RDS_DB = 27;
    public static final int RELA_RDS_USER = 28;
    public static final int RELA_DB_USER = 29;
    public static final int RELA_ROUTE_SR = 30;
    public static final int RELA_SUBNET_THIS_DCI = 31;
    public static final int RELA_SUBNET_TARGET_DCI = 32;
    public static final int RELA_SR_THIS_DCI = 33;
    public static final int RELA_SR_TARGET_DCI = 34;
    public static final int RELA_CONTAINER_PUBK = 35;
    public static final int RELA_CONTAINER_PRIK = 36;
    public static final int RELA_BRIDGENET_DCI = 37;
    public static final int RELA_NETCARD_THIS_BRIDGENET = 38;
    public static final int RELA_NETCARD_TARGET_BRIDGENET = 39;
    public static final int RELA_NIC_NETWORK = 40;
    public static final int RELA_ROUTER_EN = 41;
    public static final int RELA_FLOATINGIP_NIC = 42;
    public static final int RELA_IMAGE_VM = 43;
    public static final int RELA_VM_TARGET_SSHKEY = 44;
    public static final String[] RELA_NAME = new String[]{"RELA_VM_PN", "RELA_VM_LB", "RELA_VM_SN", "RELA_VM_EBS", "RELA_ROUTER_SN", "RELA_ROUTER_PN", "RELA_ROUTER_RU", "RELA_LB_SN", "RELA_LB_VIP", "RELA_LB_BM", "RELA_VM_SECURITY", "RELA_SECURITY_MEMBER", "RELA_PM_PN", "RELA_VM_ACTIVIRUS", "RELA_VOLUME_TASK", "RELA_VM_CARD", "RELA_NETWORKCARDS_SECURITY", "RELA_NET_SUBNET", "RELA_CLOUDTAB_USER", "RELA_LB_LBHEALTHMONITOR", "RELA_PM_SN", "RELA_SCANNER_SN", "RELA_SCANNER_VSR", "RELA_CLOUD_BACKUP_TASK", "RELA_SECURITY", "RELA_CACHE_SN", "RELA_RDS_SN", "RELA_RDS_DB", "RELA_RDS_USER", "RELA_DB_USER", "RELA_ROUTE_SR", "RELA_SUBNET_THIS_DCI", "RELA_SUBNET_TARGET_DCI", "RELA_SR_THIS_DCI", "RELA_SR_TARGET_DCI", "RELA_CONTAINER_PUBK", "RELA_CONTAINER_PRIK", "RELA_BRIDGENET_DCI", "RELA_NETCARD_THIS_BRIDGENET", "RELA_NETCARD_TARGET_BRIDGENET", "RELA_NIC_NETWORK", "RELA_ROUTER_EN", "RELA_FLOATINGIP_NIC", "RELA_IMAGE_VM", "RELA_VM_TARGET_SSHKEY"};
    public static final int RELA_STATUS_BUILDING = 0;
    public static final int RELA_STATUS_BUILD_ERR = 1;
    public static final int RELA_STATUS_CANCELING = 2;
    public static final int RELA_STATUS_CANCEL_ERR = 3;
    public static final int RELA_STATUS_CANCEL = 4;
    public static final int RELA_STATUS_OK = 9;
    public static final int RES_STATUS_NORMAL = 0;
    public static final int RES_STATUS_USEING = 1;
    public static final int RES_STATUS_PRE = 2;
    public static final int RES_STATUS_RECORVERY = 4;
    public static final int RES_STATUS_INVALID = 5;
    public static final String REGION_ID = "A";
    public static final String COUNTY_ID = "A00";
    public static final String OFFICE_ID = "A000";
    public static final String OPERATION_ID = "1001";
    public static final int CACULATE_FEE = 0;
    public static final int CACULATE_UNIT = 1;
    public static final int CACULATE_LADDER = 2;
    public static final int CACULATE_ENUM = 3;
    public static final int SERVICE_CHG_TYPE_STOP = 3;
    public static final int SERVICE_CHG_TYPE_OPEN = 1;
    public static final int SERVICE_CHG_TYPE_XK_STOP = 28;
    public static final int SERVICE_CHG_TYPE_XK_OPEN = 26;
    public static final int SUBS_STATUS_NORMAL = 0;
    public static final int SUBS_STATUS_PRE = 1;
    public static final int SUBS_TYPE_OTHER = 0;
    public static final int SUBS_TYPE_MAIN = 1;
    public static final int ACCT_TYPE_PRE = 1;
    public static final int ACCT_TYPE_POST = 2;
    public static final String FEE_TYPE_USER = "0";
    public static final String FEE_TYPE_ACCT = "1";
    public static final int IN_MODE_CODE_USER_NEW = 1;
    public static final int IN_MODE_CODE_XK = 2;
    public static final int PRTY_VALUE_CAN_CHANGE = 1;
    public static final int PRTY_VALUE_CAN_NOT_CHANGE = 2;
    public static final int INVOICE_STATUS_APPLY = 0;
    public static final int INVOICE_STATUS_PRINTED = 1;
    public static final int INVOICE_STATUS_POSTED = 2;
    public static final int INVOICE_STATUS_CHECK_PASS = 3;
    public static final int INVOICE_STATUS_CHECK_NOPASS = 4;
    public static final int INVOICE_TEMPLATE_STATUS_APPLY = 0;
    public static final int INVOICE_TEMPLATE_STATUS_CHECK_PASS = 1;
    public static final int INVOICE_TEMPLATE_STATUS_CHECK_FAIL = 2;
    public static final int IS_CUSTOMERADMIN_Y = 1;
    public static final int IS_CUSTOMERADMIN_N = 0;
    public static final int CUSTOMER_TYPE_PUB = 0;
    public static final int CUSTOMER_TYPE_COM = 1;
    public static final int CUSTOMER_TYPE_TAB = 2;
    public static final int CA_2_CUST_STATUS_UNVALID = 0;
    public static final int CA_2_CUST_STATUS_VALID = 1;
    public static final String SENT_INIT = "0";
    public static final String SENT_OVER = "1";
    public static final String SEND_FAILED = "2";
    public static final String SENDING = "3";
    public static final String SMS = "0";
    public static final String MAIL = "1";
    public static final int CUST_IDENT_STATUS_PRE = 1;
    public static final int CUST_IDENT_STATUS_PASS = 2;
    public static final int CUST_IDENT_STATUS_REJECT = 3;
    public static final String[] SAFE_REPORT_RANGE = new String[]{"LAST_HOUR", "LAST_24_HOURS", "LAST_7_DAYS", "CUSTOM_RANGE", "CUSTOM_RANGE", "CUSTOM_RANGE", "CUSTOM_RANGE", "CUSTOM_RANGE"};
    public static final int CODE_PARAM_FORMATE_FAIL = 1100;
    public static final int CODE_AUTH_FAIL = 1200;
    public static final int CODE_INNER_ERROR = 5000;
    public static final int CODE_PRIVILEGE_ERROR = 1300;
    public static final int CODE_ACCESS_KEY_IS_EMPTY = 1101;
    public static final int CODE_SECRET_KEY_IS_EMPTY = 1102;
    public static final int CODE_SIGN_IS_EMPTY = 1103;
    public static final int CODE_SUCCESS = 0;
    public static final int CODE_PARAM_VALID = 201;
    public static final String SERVICE_TYPE = "servicetype";
    public static final String RMQ_KEY_TENANT_QUOTA_INIT = "tenantQuotaInitKey";
    public static final String RMQ_KEY_TRADE_DEAL = "tradeJobDealKey";
    public static final String RMQ_KEY_COMM_SUCC_IPVS = "comSuccIpvsRmqKey";
    public static final String RMQ_KEY_COMM_ERROR_IPVS = "comErrorIpvsRmqKey";
    public static final String RMQ_KEY_CREATE_DEF_SUB = "createDefaultSubKey";
    public static final String RMQ_KEY_CREATE_DEF_SUB_NEW = "createDefaultSubNewKey";
    public static final String RMQ_KEY_CREATE_DEF_SECRI_GROUP = "createDefaultSeGroupKey";
    public static final String RMQ_KEY_CREATE_DEF_SECRI_GROUP_NEW = "createDefaultSeGroupNewKey";
    public static final String RMQ_KEY_AM_ORDER = "amOrderTradeKey";
    public static final String RMQ_KEY_CALL_BACK_RESPONCE = "callbackResponceKey";
    public static final String YW_RMQ_KEY_COMM_SUCC_IPVS = "YWSuccIpvsRmqKey";
    public static final String YW_RMQ_KEY_COMM_ERROR_IPVS = "YWErrorIpvsRmqKey";
    public static final String BATCH_ORDER = "1";
    public static final String INVENTORY_MANAGER = "INVENTORY_MANAGER";
    public static final String SUB_SERVICE_HANGED = "hanged";
    public static final int SERVICE_TYPE_CACHE = 1828;
    public static final int SERVICE_TYPE_CACHE_CONFIGURE = 1829;
    public static final String SERVICE_PRODUCT_ERROR_EXPANSION = "expansion error";
    public static final String SUB_SERVICE_MIGRATE = "migrating";
    public static final String KAPTCHA_SESSION_KEY = "KAPTCHA_SESSION_KEY";

    public Constants() {
    }

    public static final String getError(String inParam) {
        Map<String, String> errorMap = new HashMap();
        errorMap.put("starting", "start error");
        errorMap.put("stopping", "stop error");
        errorMap.put("resetting", "reboot error");
        errorMap.put("migrateing", "migrate error");
        errorMap.put("pwdresetting", "resetpassword error");
        errorMap.put("opening", "create error");
        errorMap.put("deleting", "delete error");
        errorMap.put("changing", "update error");
        errorMap.put("attaching", "attach error");
        errorMap.put("unattaching", "detach error");
        errorMap.put("binding", "bind error");
        errorMap.put("unbinding", "unbind error");
        errorMap.put("changing", "change error");
        errorMap.put("backuping", "cloud backup error");
        errorMap.put("expansioning", "expansion error");
        errorMap.put("adding", "add error");
        errorMap.put("hostrestoring", "hostrestore error");
        String outParam = (String) errorMap.get(inParam);
        return outParam;
    }

    public static final String getServiceName(String inName, int serviceType, long subscriptionId) {
        String serviceName = "";
        if (!"".equals(inName)) {
            serviceName = inName + "_" + subscriptionId;
        } else {
            if (1001 == serviceType) {
                serviceName = "VM_" + subscriptionId;
            }

            if (1002 == serviceType) {
                serviceName = "EBS_" + subscriptionId;
            }

            if (1003 == serviceType) {
                serviceName = "LB_" + subscriptionId;
            }

            if (1012 == serviceType) {
                serviceName = "OBJ_" + subscriptionId;
            }

            if (1013 == serviceType) {
                serviceName = "FILE_" + subscriptionId;
            }

            if (1006 == serviceType) {
                serviceName = "PUBNET" + subscriptionId;
            }

            if (1007 == serviceType) {
                serviceName = "CLOUD_" + subscriptionId;
            }

            if (1008 == serviceType) {
                serviceName = "ROUTER_" + subscriptionId;
            }

            if (1009 == serviceType) {
                serviceName = "SUBNET_" + subscriptionId;
            }

            if (1010 == serviceType) {
                serviceName = "SECURITY_" + subscriptionId;
            }

            if (1016 == serviceType) {
                serviceName = "PM_" + subscriptionId;
            }

            if (1015 == serviceType) {
                serviceName = "CLOUDTAB_" + subscriptionId;
            }

            if (8008 == serviceType) {
                serviceName = "ANTIVIRUS_" + subscriptionId;
            }

            if (1018 == serviceType) {
                serviceName = "IMAGE_" + subscriptionId;
            }

            if (1020 == serviceType) {
                serviceName = "VOLUMEBACKUP_" + subscriptionId;
            }

            if (8104 == serviceType) {
                serviceName = "APPVM_" + subscriptionId;
            }

            if (1021 == serviceType) {
                serviceName = "TASK_" + subscriptionId;
            }

            if (8211 == serviceType) {
                serviceName = "NIC_" + subscriptionId;
            }

            if (1023 == serviceType) {
                serviceName = "OBSBACKUP_" + subscriptionId;
            }

            if (1024 == serviceType) {
                serviceName = "OBSTASK_" + subscriptionId;
            }

            if (1025 == serviceType) {
                serviceName = "NASBACKUP_" + subscriptionId;
            }

            if (1026 == serviceType) {
                serviceName = "NASTASK_" + subscriptionId;
            }

            if (1030 == serviceType) {
                serviceName = "CLOUD_BACKUP_TASK_" + subscriptionId;
            }
        }

        return serviceName;
    }

}
