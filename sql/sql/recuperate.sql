/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : recuperate

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 09/07/2020 11:10:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hotel_in
-- ----------------------------
DROP TABLE IF EXISTS `hotel_in`;
CREATE TABLE `hotel_in`  (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `CREATE_DATE` date NULL DEFAULT NULL,
  `CUSTOMER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CUSTOMER_AGE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CUSTOMER_SEX` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `IDCARD` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ROOMID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `BUILDING_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ELDER_TYPE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CHECKIN_DATE` date NULL DEFAULT NULL,
  `EXPIRATION_DATE` date NULL DEFAULT NULL,
  `CONTACTTEL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `BED_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PSYCHOSOMATICSTATE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ATTENTION` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `STATUS` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hotel_in
-- ----------------------------
INSERT INTO `hotel_in` VALUES (1, '2020-07-09', '李一', '85', '男', '370406197204278975', '5', '3', '月卡', '2020-07-08', '2020-07-30', '2', '1', '老年痴呆', '注意24小时陪护', '1');
INSERT INTO `hotel_in` VALUES (2, '2020-07-11', '张倩', '88', '女', '130629197912202796', '3', '2', '季卡', '2020-07-04', '2020-07-19', '1', '2', '残疾', '吃饭不方便，需要喂食', '0');
INSERT INTO `hotel_in` VALUES (5, '2020-07-08', '孙向红', '67', '女', '130421198906071630', '3', '3', '年卡', '2020-11-11', '2020-06-10', '2', '3', '冠心病', '少油', '0');
INSERT INTO `hotel_in` VALUES (7, '2020-07-08', '王明', '57', '女', '411402198811214837', '6', '6', '年卡', '6671-08-05', '2020-06-09', '1', '6', '脱发', '不能熬夜', '0');
INSERT INTO `hotel_in` VALUES (8, '2020-07-06', '孙力', '103', '0', '350402198201251393', '13', '12', '季卡', '2020-07-16', '2020-06-16', '1', '4', '高血糖', '少糖', '1');
INSERT INTO `hotel_in` VALUES (9, '2020-06-29', '周宗格', '57', '男', '350402198906037952', '7', '10', '季卡', '2020-07-13', '2020-07-09', '2', '2', '肥胖', '多运动', '0');

-- ----------------------------
-- Table structure for index_info
-- ----------------------------
DROP TABLE IF EXISTS `index_info`;
CREATE TABLE `index_info`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PASSWORD` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ADD_DATE` datetime(0) NULL DEFAULT NULL,
  `LABEL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of index_info
-- ----------------------------
INSERT INTO `index_info` VALUES (1, 'villager', '111111', '2020-07-08 09:34:07', '管理员');

-- ----------------------------
-- Table structure for nurse_info
-- ----------------------------
DROP TABLE IF EXISTS `nurse_info`;
CREATE TABLE `nurse_info`  (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `PRICE` decimal(10, 2) NULL DEFAULT NULL,
  `DESCIBE` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `FLAG` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `STATUS` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `LEVEL` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1126 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nurse_info
-- ----------------------------
INSERT INTO `nurse_info` VALUES (1101, '房间清扫', 10.00, '为老人打扫房间卫生', '是', '关闭', '三级');
INSERT INTO `nurse_info` VALUES (1102, '衣物清洗', 10.00, '为老人清洗衣物', '否', '开启', '三级');
INSERT INTO `nurse_info` VALUES (1103, '床品清洗', 10.00, '为老人清洗床单、晒被褥', '是', '关闭', '三级');
INSERT INTO `nurse_info` VALUES (1104, '洗澡协助', 10.00, '协助半自理老人洗澡', '否', '关闭', '二级');
INSERT INTO `nurse_info` VALUES (1105, '个人卫生', 10.00, '帮助半自理老人刮胡须剪指甲', '是', '开启', '二级');
INSERT INTO `nurse_info` VALUES (1106, '洗澡帮助', 15.00, '帮助非自理老人洗澡洗头', '是', '关闭', '一级');
INSERT INTO `nurse_info` VALUES (1107, '进食帮助', 10.00, '帮助非自理老人进食', '否', '开启', '一级');
INSERT INTO `nurse_info` VALUES (1108, '活动协助', 10.00, '帮助非自理的老人适当活动四肢', '是', '关闭', '一级');

-- ----------------------------
-- Table structure for nurse_record
-- ----------------------------
DROP TABLE IF EXISTS `nurse_record`;
CREATE TABLE `nurse_record`  (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `CUSTOMERNAME` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NURSINGNAME` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `TIME` date NULL DEFAULT NULL,
  `COUNT` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `STAFFNAME` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2220 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nurse_record
-- ----------------------------
INSERT INTO `nurse_record` VALUES (2201, '吴平安', '房间清扫', '2020-07-01', '1', '王伟');
INSERT INTO `nurse_record` VALUES (2202, '张倩', '洗澡协助', '2020-07-06', '1', '耿云');
INSERT INTO `nurse_record` VALUES (2203, '王明', '洗澡协助', '2020-07-05', '1', '杨一凡');
INSERT INTO `nurse_record` VALUES (2205, '孙力', '个人卫生', '2020-07-01', '1', '徐晶晶');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `STAFFNAME` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `STAFFSEX` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `STAFFAGE` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `STAFFTYPE` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PHONENUMBER` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3321 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES (3301, '杨一凡', '女', '45', '护工', '13567266534');
INSERT INTO `user_info` VALUES (3302, '王伟', '男', '50', '护工', '18265341889');
INSERT INTO `user_info` VALUES (3303, '杨帆', '男', '47', '护工', '15672683787');

SET FOREIGN_KEY_CHECKS = 1;
