
SELECT  ROUND(SUM(DAILY_FEE) / COUNT(*), 0)
FROM CAR_RENTAL_COMPANY_CAR C 
WHERE C.CAR_TYPE = "SUV"
