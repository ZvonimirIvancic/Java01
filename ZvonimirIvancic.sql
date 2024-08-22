CREATE DATABASE ZvonimirIvancic
GO
USE ZvonimirIvancic
GO

CREATE TABLE Users
(
	IDUsers INT PRIMARY KEY IDENTITY,
	Username NVARCHAR(25),
	Ppassword NVARCHAR(100),
	MemberRole TINYINT, CONSTRAINT CHK_MEMBERROLE CHECK (MemberRole IN (0, 1)) 
)
GO

CREATE TABLE Movie
(
	IDMovie INT PRIMARY KEY IDENTITY,
	Title NVARCHAR(50),
	PublishedDate NVARCHAR(50),
	Description NVARCHAR(50),
	OrginalTitle NVARCHAR(50),
	Duration INT,
	ReleaseYear INT,
	Genre NVARCHAR(50),
	PicturePath NVARCHAR(50)
)
GO

CREATE TABLE Person
(
	IDPerson INT PRIMARY KEY IDENTITY,
	fullName NVARCHAR(50)
)
GO

CREATE TABLE Actor
(	
	PersonID INT FOREIGN KEY REFERENCES Person(IDPerson)
)
GO

CREATE TABLE Director
(		
	PersonID INT FOREIGN KEY REFERENCES Person(IDPerson)
)
GO

CREATE PROCEDURE createMovie
	@Title NVARCHAR(50),
	@PublishedDate NVARCHAR(50),
	@Description NVARCHAR(50),
	@OrginalTitle NVARCHAR(50),
	@Duration INT,
	@ReleaseYear INT,
	@Genre NVARCHAR(50),
	@PicturePath NVARCHAR(50),	
	@IDMovie INT OUTPUT
AS 
BEGIN 
	INSERT INTO Movie VALUES(@Title, @PublishedDate, @Description, @OrginalTitle, @Duration, @ReleaseYear, @Genre, @PicturePath)
	SET @IDMovie = SCOPE_IDENTITY()
END
GO

CREATE PROCEDURE updateMovie
	@Title NVARCHAR(50),
	@PublishedDate NVARCHAR(50),
	@Description NVARCHAR(50),
	@OrginalTitle NVARCHAR(50),
	@Duration INT,
	@ReleaseYear INT,
	@Genre NVARCHAR(50),
	@PicturePath NVARCHAR(50),	
	@IDMovie INT 
	 
AS 
BEGIN 
	UPDATE Movie SET 
		Title = @Title,
		PublishedDate = @PublishedDate,
		Description = @Description,
		OrginalTitle = @OrginalTitle,
		Duration = @Duration,
		ReleaseYear = @ReleaseYear,
		Genre = @Genre,
		PicturePath = @PicturePath		
	WHERE 
		IDMovie = @IDMovie
END
GO


CREATE PROCEDURE deleteMovie
	@IDMovie INT	 
AS 
BEGIN 
	DELETE FROM Movie
	WHERE 
		IDMovie = @IDMovie
END
GO

CREATE PROCEDURE selectMovie
	@IDMovie INT
AS 
BEGIN 
	SELECT * FROM Movie
	WHERE 
		IDMovie = @IDMovie
END
GO

CREATE PROCEDURE selectMovies
AS 
BEGIN 
	SELECT * FROM Movie
END
GO

CREATE PROC userLogin	
AS
SELECT * FROM Users

GO

CREATE PROC UserRegister
	@Username NVARCHAR(25),
	@Ppassword NVARCHAR(100)
AS
IF exists (SELECT * FROM Users WHERE Username = @Username and Ppassword = @Ppassword )
	BEGIN
		SELECT 0 AS Result
	END
ELSE
	BEGIN
		INSERT INTO Users VALUES (@Username, @Ppassword, 0)
		SELECT 1 AS Result
	END
GO

CREATE PROC adminCreate
AS
SELECT * FROM Users
IF not exists (SELECT * FROM Users WHERE MemberRole = 1)
	BEGIN
INSERT INTO Users VALUES('admin','admin', 1)
END
GO


CREATE PROC deleteAll	
AS
DELETE FROM Movie
DELETE FROM Actor
DELETE FROM Director
GO


use ZvonimirIvancic
go
select * from Movie
go
select * from Person
go select * from Users
go
use master

drop database ZvonimirIvancic

