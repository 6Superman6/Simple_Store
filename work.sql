/*
 Navicat Premium Data Transfer

 Source Server         : 88
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : work

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 14/11/2019 20:57:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for content
-- ----------------------------
DROP TABLE IF EXISTS `content`;
CREATE TABLE `content`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `price` double(20, 1) NULL DEFAULT NULL COMMENT '当前价格',
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `icon` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '摘要',
  `text` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '正文',
  `isbuy` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '已购买',
  `issell` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '已卖出',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 43 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of content
-- ----------------------------
INSERT INTO `content` VALUES (1, 6687.0, '6687', 'https://img.alicdn.com/imgextra/i4/11899611/O1CN01DYSc2P2Krt9QWaXh0_!!0-saturn_solar.jpg_220x220.jpg_.webp', '6687', '6687', 'true', 'true');
INSERT INTO `content` VALUES (2, 4.0, '44', 'https://img.alicdn.com/imgextra/i4/11899611/O1CN01DYSc2P2Krt9QWaXh0_!!0-saturn_solar.jpg_220x220.jpg_.webp', '55', '6666', 'true', 'true');
INSERT INTO `content` VALUES (3, 6.0, '6666', 'https://img.alicdn.com/imgextra/i4/11899611/O1CN01DYSc2P2Krt9QWaXh0_!!0-saturn_solar.jpg_220x220.jpg_.webp', '666', '全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文全文', 'true', 'true');
INSERT INTO `content` VALUES (4, 136.0, '555', 'https://img.alicdn.com/imgextra/i4/11899611/O1CN01DYSc2P2Krt9QWaXh0_!!0-saturn_solar.jpg_220x220.jpg_.webp', '55', '6666', 'true', 'true');
INSERT INTO `content` VALUES (5, 4.0, '333', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '333', '6666', 'true', 'true');
INSERT INTO `content` VALUES (6, 34.0, 'sdf', 'https://img.alicdn.com/imgextra/i4/11899611/O1CN01DYSc2P2Krt9QWaXh0_!!0-saturn_solar.jpg_220x220.jpg_.webp', 'sdfsdf', '6666', 'true', 'true');
INSERT INTO `content` VALUES (7, 55.0, '55', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '55', '6666', 'true', 'true');
INSERT INTO `content` VALUES (8, 22.0, 'yy', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '222', '6666', 'true', 'true');
INSERT INTO `content` VALUES (9, 4.0, '5553', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '5553', '6666', 'true', 'true');
INSERT INTO `content` VALUES (10, 55.0, 'tt', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', 'tt', '6666', 'true', 'true');
INSERT INTO `content` VALUES (11, 33.0, 'yy', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', 'yy', '6666', 'true', 'true');
INSERT INTO `content` VALUES (12, 77.0, '77', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '77', '6666', 'true', 'true');
INSERT INTO `content` VALUES (13, 77.0, '77', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '77', '6666', 'true', 'true');
INSERT INTO `content` VALUES (14, 77.0, '77', 'https://img.alicdn.com/imgextra/i4/11899611/O1CN01DYSc2P2Krt9QWaXh0_!!0-saturn_solar.jpg_220x220.jpg_.webp', '77', '6666', NULL, NULL);
INSERT INTO `content` VALUES (15, 6789.0, '6789', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '6789', '6666', 'true', 'true');
INSERT INTO `content` VALUES (16, 55.0, '4433', 'https://img.alicdn.com/imgextra/i4/11899611/O1CN01DYSc2P2Krt9QWaXh0_!!0-saturn_solar.jpg_220x220.jpg_.webp', '55', '6666', NULL, NULL);
INSERT INTO `content` VALUES (17, 1.0, '5555334', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '5555334', '6666', 'true', 'true');
INSERT INTO `content` VALUES (18, 969.0, '3423323', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '3423323', '6666', 'true', 'true');
INSERT INTO `content` VALUES (19, 333.0, '777777', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '777777', '3353535', 'true', 'true');
INSERT INTO `content` VALUES (20, 66.0, '66666', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '32323', '6666', 'true', 'true');
INSERT INTO `content` VALUES (21, 668.0, '323236', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '323236', '323236', 'true', 'true');
INSERT INTO `content` VALUES (22, 668.0, '32323', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '32323', '45665443245', 'true', 'true');
INSERT INTO `content` VALUES (31, 12321.0, '12321', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '12321', '12321', 'true', 'true');
INSERT INTO `content` VALUES (33, 33.0, 'sdfsdfsdf', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', 'sdfsdf', 'sdfsdfsdfsdf', 'true', 'true');
INSERT INTO `content` VALUES (35, 5.0, '32323', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '32323', '和国际化', NULL, NULL);
INSERT INTO `content` VALUES (36, 345345.0, '32323', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '32323', '士大夫', NULL, NULL);
INSERT INTO `content` VALUES (37, 233.0, '32323', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '323236', '士大夫收', NULL, NULL);
INSERT INTO `content` VALUES (38, 5556.0, '66666', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '32323', '士大夫', NULL, NULL);
INSERT INTO `content` VALUES (39, 2334.0, 'aaaa', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '32323', '士大夫收', NULL, NULL);
INSERT INTO `content` VALUES (40, 212.4, '32323', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', '32323', '121212', NULL, NULL);
INSERT INTO `content` VALUES (41, 55.0, 'bbbbb', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', 'bbbb', '', NULL, NULL);
INSERT INTO `content` VALUES (42, 223655.7, 'xxxx', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp', 'xxxxx', 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', 'true', 'true');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码md5加密',
  `nickName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `userType` tinyint(3) NULL DEFAULT NULL COMMENT '类型，买家0，卖家1',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES (1, 'seller', '981c57a5cfb0f868e064904b8745766f', 'seller', 1);
INSERT INTO `person` VALUES (2, 'buyer', '37254660e226ea65ce6f1efd54233424', 'buyer', 0);
INSERT INTO `person` VALUES (3, 'root', '123456', 'root', 0);
INSERT INTO `person` VALUES (4, 'admin', 'admin', 'admin', 1);
INSERT INTO `person` VALUES (5, 'xiaoqiang', '123456', 'xiaoqiang', 0);
INSERT INTO `person` VALUES (6, '小明', '123456', '小明', 0);
INSERT INTO `person` VALUES (7, 'xiaowang', '123456', 'xiaowang', 1);

-- ----------------------------
-- Table structure for trx
-- ----------------------------
DROP TABLE IF EXISTS `trx`;
CREATE TABLE `trx`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `contentId` int(11) NULL DEFAULT NULL COMMENT '内容ID',
  `personId` int(11) NULL DEFAULT NULL COMMENT '用户ID',
  `price` double(11, 1) NULL DEFAULT NULL COMMENT '购买价格',
  `time` bigint(20) NULL DEFAULT NULL COMMENT '购买时间',
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `icon` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `contentId`(`contentId`) USING BTREE,
  INDEX `personId`(`personId`) USING BTREE,
  CONSTRAINT `trx_ibfk_1` FOREIGN KEY (`contentId`) REFERENCES `content` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `trx_ibfk_2` FOREIGN KEY (`personId`) REFERENCES `person` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of trx
-- ----------------------------
INSERT INTO `trx` VALUES (2, 15, 3, 6789.0, 20191113, '6789', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp');
INSERT INTO `trx` VALUES (3, 18, 3, 969.0, 20191113, '3423323', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp');
INSERT INTO `trx` VALUES (4, 12, 3, 77.0, 20191113, '77', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp');
INSERT INTO `trx` VALUES (5, 31, 3, 12321.0, 1573659856149, '12321', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp');
INSERT INTO `trx` VALUES (6, 13, 3, 77.0, 1573693803341, '77', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp');
INSERT INTO `trx` VALUES (7, 17, 3, 1.0, 1573693827471, '5555334', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp');
INSERT INTO `trx` VALUES (8, 33, 3, 33.0, 1573694402457, 'sdfsdfsdf', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp');
INSERT INTO `trx` VALUES (9, 11, 3, 33.0, 1573735941206, 'yy', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp');
INSERT INTO `trx` VALUES (10, 42, 3, 223655.0, 1573735956128, 'xxxx', 'https://img.alicdn.com/imgextra/i3/1163706077339504089/TB28L_Uvq8lpuFjy0FpXXaGrpXa_!!0-saturn_solar.jpg_220x220.jpg_.webp');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL,
  `age` int(25) NULL DEFAULT NULL,
  `name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 210, '22刘广欣222', '2019-01-01 16:00:00');
INSERT INTO `user` VALUES (2, 200, '刘广欣2229', '2019-01-01 16:00:00');
INSERT INTO `user` VALUES (3, 10, 'kkk', '2019-01-01 16:00:00');
INSERT INTO `user` VALUES (4, 10, 'kkk', '2019-01-01 16:00:00');
INSERT INTO `user` VALUES (201702, 10, 'kkk', '2019-01-01 16:00:00');

SET FOREIGN_KEY_CHECKS = 1;
