-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bluebank
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bluebank
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bluebank` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `bluebank` ;

-- -----------------------------------------------------
-- Table `bluebank`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bluebank`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cpf` VARCHAR(255) NULL DEFAULT NULL,
  `data_de_nascimento` VARCHAR(255) NULL DEFAULT NULL,
  `nome` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `UK_r1u8010d60num5vc8fp0q1j2a` (`cpf` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bluebank`.`conta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bluebank`.`conta` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `agencia` VARCHAR(255) NULL DEFAULT NULL,
  `numero_conta` VARCHAR(255) NULL DEFAULT NULL,
  `saldo` DOUBLE NOT NULL,
  `status` BIT(1) NOT NULL,
  `tipo_conta` INT NOT NULL,
  `id_cliente` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `UK_5d7usw0pgh0mpy3nygka3x1x0` (`numero_conta` ASC) VISIBLE,
  INDEX `FK4o5w6tmaqt0ojd6anrub0qny8` (`id_cliente` ASC) VISIBLE,
  CONSTRAINT `FK4o5w6tmaqt0ojd6anrub0qny8`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `bluebank`.`cliente` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bluebank`.`contato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bluebank`.`contato` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `numero_telefone` VARCHAR(255) NULL DEFAULT NULL,
  `id_cliente` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK9g5kqiu1sb4yxs81ifvx4bgwp` (`id_cliente` ASC) VISIBLE,
  CONSTRAINT `FK9g5kqiu1sb4yxs81ifvx4bgwp`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `bluebank`.`cliente` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bluebank`.`endereco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bluebank`.`endereco` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cep` VARCHAR(255) NULL DEFAULT NULL,
  `cidade` VARCHAR(255) NULL DEFAULT NULL,
  `estado` VARCHAR(255) NULL DEFAULT NULL,
  `logradouro` VARCHAR(255) NULL DEFAULT NULL,
  `numero` INT NOT NULL,
  `id_cliente` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKe4y3uftwnlua4wuwisldhnjl4` (`id_cliente` ASC) VISIBLE,
  CONSTRAINT `FKe4y3uftwnlua4wuwisldhnjl4`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `bluebank`.`cliente` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bluebank`.`transacoes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bluebank`.`transacoes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `data` VARCHAR(255) NULL DEFAULT NULL,
  `tipo_transacao` INT NULL DEFAULT NULL,
  `valor` DOUBLE NOT NULL,
  `id_conta_destino` INT NULL DEFAULT NULL,
  `id_conta_origem` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKtr069lowrggloiavov4945fp7` (`id_conta_destino` ASC) VISIBLE,
  INDEX `FKtr8kap6ogq9toa07o3qi62jbh` (`id_conta_origem` ASC) VISIBLE,
  CONSTRAINT `FKtr069lowrggloiavov4945fp7`
    FOREIGN KEY (`id_conta_destino`)
    REFERENCES `bluebank`.`conta` (`id`),
  CONSTRAINT `FKtr8kap6ogq9toa07o3qi62jbh`
    FOREIGN KEY (`id_conta_origem`)
    REFERENCES `bluebank`.`conta` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
