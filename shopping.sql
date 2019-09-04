/*
 Navicat Premium Data Transfer

 Source Server         : my-test
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : 127.0.0.1:3306
 Source Schema         : shopping

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 04/09/2019 16:45:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sp_goods
-- ----------------------------
DROP TABLE IF EXISTS `sp_goods`;
CREATE TABLE `sp_goods` (
  `id` bigint(13) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) NOT NULL,
  `goods_name` varchar(255) NOT NULL,
  `goods_price` decimal(12,3) NOT NULL,
  `goods_thumb` varchar(255) DEFAULT NULL,
  `goods_remark` varchar(2000) DEFAULT NULL,
  `del_flag` tinyint(1) DEFAULT '0',
  `status` tinyint(1) DEFAULT '0',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `edit_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='商品表';

-- ----------------------------
-- Records of sp_goods
-- ----------------------------
BEGIN;
INSERT INTO `sp_goods` VALUES (6, '电器', 'iphonex', 1000.000, 'htpps://www.aiqiyi.com', '123', 0, 1, '2019-08-28 21:03:15', '2019-08-28 21:03:15');
COMMIT;

-- ----------------------------
-- Table structure for sp_shopping_cart
-- ----------------------------
DROP TABLE IF EXISTS `sp_shopping_cart`;
CREATE TABLE `sp_shopping_cart` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) NOT NULL COMMENT '用户id',
  `goods_id` bigint(11) NOT NULL COMMENT '商品id',
  `del_flag` tinyint(1) DEFAULT '0',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `edit_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='购物车';

-- ----------------------------
-- Records of sp_shopping_cart
-- ----------------------------
BEGIN;
INSERT INTO `sp_shopping_cart` VALUES (2, 3, 22, 0, '2019-09-01 22:15:44', '2019-09-01 22:15:44');
COMMIT;

-- ----------------------------
-- Table structure for sp_user
-- ----------------------------
DROP TABLE IF EXISTS `sp_user`;
CREATE TABLE `sp_user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) NOT NULL COMMENT '名称',
  `email` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(20) NOT NULL COMMENT '手机号',
  `address` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '地址',
  `del_flag` int(1) DEFAULT '0' COMMENT '是否删除',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `edit_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sp_user
-- ----------------------------
BEGIN;
INSERT INTO `sp_user` VALUES (3, '易志成', '13141016707@163.com', '13141016707', '北京', 0, '2019-08-26 22:06:39', '2019-08-26 22:06:39');
INSERT INTO `sp_user` VALUES (4, '易志成', '13141016707@163.com', '13141016707', '丰台区', 0, '2019-08-26 22:06:38', '2019-08-26 22:06:38');
INSERT INTO `sp_user` VALUES (5, 'yzc', '13141016707@163.com', '13141016707', '丰台区', NULL, '2019-08-27 22:50:27', '2019-08-27 22:50:27');
INSERT INTO `sp_user` VALUES (6, 'yzc', '13141016707@163.com', '13141016707', '丰台区', 0, '2019-08-27 22:51:34', '2019-08-27 22:51:34');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
