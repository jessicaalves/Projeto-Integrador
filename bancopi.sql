-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 06-Dez-2017 às 23:42
-- Versão do servidor: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bancopi`
--
CREATE DATABASE IF NOT EXISTS `bancopi` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `bancopi`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `telefone` varchar(13) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `responsavel` varchar(30) DEFAULT NULL,
  `telefone2` varchar(13) DEFAULT NULL,
  `cidade` varchar(30) DEFAULT NULL,
  `cep` varchar(30) DEFAULT NULL,
  `estado` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE KEY `idCliente_UNIQUE` (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `dispositivo`
--

CREATE TABLE IF NOT EXISTS `dispositivo` (
  `idDispositivo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `acessorio` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `numeroSerie` varchar(30) NOT NULL,
  `voltagem` varchar(20) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  PRIMARY KEY (`idDispositivo`),
  UNIQUE KEY `idDispositivo_UNIQUE` (`idDispositivo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `dispositivo_has_servico`
--

CREATE TABLE IF NOT EXISTS `dispositivo_has_servico` (
  `Dispositivo_idDispositivo` int(10) UNSIGNED NOT NULL,
  `Servico_idServico` int(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`Dispositivo_idDispositivo`,`Servico_idServico`),
  KEY `fk_Dispositivo_has_Servico_Servico1_idx` (`Servico_idServico`),
  KEY `fk_Dispositivo_has_Servico_Dispositivo1_idx` (`Dispositivo_idDispositivo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `operadorsistema`
--

CREATE TABLE IF NOT EXISTS `operadorsistema` (
  `codUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  PRIMARY KEY (`codUsuario`),
  UNIQUE KEY `codUsuario_UNIQUE` (`codUsuario`),
  UNIQUE KEY `Usuario_UNIQUE` (`Usuario`),
  UNIQUE KEY `senha_UNIQUE` (`senha`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `operadorsistema`
--

INSERT INTO `operadorsistema` (`codUsuario`, `Usuario`, `senha`) VALUES
(1, 'simone', 'rosana'),
(2, 'jessica', 'jessica');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `idProduto` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `quantidade` int(20) NOT NULL,
  `valor` float NOT NULL,
  `configuracao` varchar(30) NOT NULL,
  PRIMARY KEY (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `servico`
--

CREATE TABLE IF NOT EXISTS `servico` (
  `idServico` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `Cliente_idCliente` int(10) UNSIGNED NOT NULL,
  `id_dispositivo` int(10) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `valor` double NOT NULL,
  `solucao` varchar(40) NOT NULL,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`idServico`),
  UNIQUE KEY `idServico_UNIQUE` (`idServico`),
  KEY `fk_Servico_Cliente_idx` (`Cliente_idCliente`),
  KEY `Cliente_idCliente` (`Cliente_idCliente`),
  KEY `id_dispositivo` (`id_dispositivo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `servicos_has_produtos`
--

CREATE TABLE IF NOT EXISTS `servicos_has_produtos` (
  `iD` int(11) NOT NULL AUTO_INCREMENT,
  `idProduto` int(11) NOT NULL,
  `idServico` int(11) NOT NULL,
  `quantidade` int(45) NOT NULL,
  `valor` double NOT NULL,
  PRIMARY KEY (`iD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `dispositivo_has_servico`
--
ALTER TABLE `dispositivo_has_servico`
  ADD CONSTRAINT `fk_Dispositivo_has_Servico_Dispositivo1` FOREIGN KEY (`Dispositivo_idDispositivo`) REFERENCES `dispositivo` (`idDispositivo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Dispositivo_has_Servico_Servico1` FOREIGN KEY (`Servico_idServico`) REFERENCES `servico` (`idServico`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `servico`
--
ALTER TABLE `servico`
  ADD CONSTRAINT `fk_Servico_Cliente` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
