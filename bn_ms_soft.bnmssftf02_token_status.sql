CREATE TABLE `usuarios` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) COLLATE utf8mb3_bin NOT NULL,
  `apellido` varchar(40) COLLATE utf8mb3_bin NOT NULL,
  `telefono` varchar(40) COLLATE utf8mb3_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb3_bin NOT NULL,
  `password` varchar(40) COLLATE utf8mb3_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
CREATE TABLE `bnmssftf02_token_status` (
  `f02_id_token_status` int NOT NULL AUTO_INCREMENT,
  `f02_affil_status_final` varchar(255) DEFAULT NULL,
  `f02_affil_status_initial` varchar(255) DEFAULT NULL,
  `f02_application` varchar(255) DEFAULT NULL,
  `f02_channel` varchar(255) DEFAULT NULL,
  `f02_channel_code` varchar(255) DEFAULT NULL,
  `f02_cia_code` varchar(255) DEFAULT NULL,
  `f02_date_token_status` datetime(6) DEFAULT NULL,
  `f02_email` varchar(255) DEFAULT NULL,
  `f02_id_client` varchar(255) DEFAULT NULL,
  `f02_mobile_store` varchar(255) DEFAULT NULL,
  `f02_model_mobile` varchar(255) DEFAULT NULL,
  `f02_name_client` varchar(255) DEFAULT NULL,
  `f02_numer_mobile` varchar(9) DEFAULT NULL,
  `f02_oper_mobile` varchar(255) DEFAULT NULL,
  `f02_reason_code` varchar(255) DEFAULT NULL,
  `f02_security_status` varchar(255) DEFAULT NULL,
  `f02_token_notification` varchar(255) DEFAULT NULL,
  `f02_token_status_final` varchar(255) DEFAULT NULL,
  `f02_token_status_initial` varchar(255) DEFAULT NULL,
  `f02_type_operation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`f02_id_token_status`)
) ENGINE=InnoDB AUTO_INCREMENT=134176 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
