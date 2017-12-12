-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.36
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `15tic`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1035`
--

CREATE TABLE `cv_1035` (
  `id_cv` bigint(20) NOT NULL,
  `alamat` varchar(150) NOT NULL,
  `nama` varchar(150) NOT NULL,
  `nohp` double NOT NULL,
  `id_nilai` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1035`
--

INSERT INTO `cv_1035` (`id_cv`, `alamat`, `nama`, `nohp`, `id_nilai`) VALUES
(1, 'Jl. USA', 'Isti', 81268706483, 1),
(2, 'Jl. Ampera Ujung', 'Fanny', 81365474909, 2),
(3, 'Jl. Bathin Batuah', 'Afdhal', 81278280884, 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1035`
--

CREATE TABLE `nilai_1035` (
  `id_nilai` bigint(20) NOT NULL,
  `nama` varchar(150) NOT NULL,
  `nilai` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1035`
--

INSERT INTO `nilai_1035` (`id_nilai`, `nama`, `nilai`) VALUES
(1, 'Isti', 100),
(2, 'Fanny', 88),
(3, 'Afdhal', 80);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1035`
--
ALTER TABLE `cv_1035`
  ADD PRIMARY KEY (`id_cv`),
  ADD KEY `FKfod2eep7kl4dl7oan7wgy20rd` (`id_nilai`);

--
-- Indexes for table `nilai_1035`
--
ALTER TABLE `nilai_1035`
  ADD PRIMARY KEY (`id_nilai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1035`
--
ALTER TABLE `cv_1035`
  MODIFY `id_cv` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `nilai_1035`
--
ALTER TABLE `nilai_1035`
  MODIFY `id_nilai` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `cv_1035`
--
ALTER TABLE `cv_1035`
  ADD CONSTRAINT `FKfod2eep7kl4dl7oan7wgy20rd` FOREIGN KEY (`id_nilai`) REFERENCES `nilai_1035` (`id_nilai`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
