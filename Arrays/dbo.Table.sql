CREATE TABLE [dbo].[Table]
(
	[AccountNumber] INT NOT NULL PRIMARY KEY, 
    [FirstName] NVARCHAR(50) NULL, 
    [LastName] NVARCHAR(50) NULL, 
    [Email] NVARCHAR(50) NULL, 
    [Phone] NCHAR(24) NULL, 
    [BalanceDate] DATETIME NULL, 
    [Balance] DECIMAL(19, 4) NULL
)
