Base de datos:
create database farmaciaMed;
use farmaciaMed;

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `usuario` varchar(20) NOT NULL,
  `clave` varchar(25) NOT NULL,
  `tipoUsuario` enum('Administrador','Empleado') NOT NULL,
  `estado` int DEFAULT '1',
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


INSERT INTO `usuarios` VALUES (1,'Nessa','1234','Administrador',1);

