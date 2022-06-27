use trackit;

SELECT *
FROM Worker
WHERE WorkerId IN (
    SELECT WorkerId FROM ProjectWorker
);


SET sql_safe_updates=0;
SET sql_safe_updates=1;
UPDATE worker 
SET LastName = 'Hunter'
WHERE FirstName = 'Kingsly' AND LastName = 'Oaks';

select FirstName, LastName 
from Worker 
WHERE FirstName = 'Rosemonde' OR FirstName = 'Kingsly';