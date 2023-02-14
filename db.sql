CREATE TABLE `abctech_db`.`provider` (
    `id` INT NOT NULL,
    `name` VARCHAR(255) NULL,
    `email` VARCHAR(255) NULL,
    `phone` VARCHAR(45) NULL,
    PRIMARY KEY (`id`));

ALTER TABLE `abctech_db`.`provider`
    CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ,
    ADD UNIQUE INDEX `id_UNIQUE` (`id` ASC);


CREATE TABLE `service` (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(255) NOT NULL,
    `description` tinytext NOT NULL
);