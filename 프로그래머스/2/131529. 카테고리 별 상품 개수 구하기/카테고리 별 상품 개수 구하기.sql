-- 코드를 입력하세요
SELECT CATEGORY, COUNT(*) AS PRODUCTS
FROM (SELECT SUBSTRING(PRODUCT_CODE,1,2) AS CATEGORY
     FROM PRODUCT) AS TEMP
GROUP BY CATEGORY
ORDER BY CATEGORY
