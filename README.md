# auditdata-microservice
This project gives following features-

1. For Cache service, given an api to GET retrieve interface details for interface by id.

        Request:
        * Method: GET
        * URL: http://localhost:9080/api/interfaces/1
        
        Response:
         {
          "id": 1,
          "name": "DH",
          "createdAt": "2020-03-16T14:23:41.450405"
         }
         
2. For Audit service, gives an api to 'save audit message' in Audit Table.

        Request:
        * Method: POST        
        * POST http://localhost:9081/api/audits/
         { 
          "status": "DH-Interface Received"
         }
         
        Response:
         {
          "audit_id": 2,
          "status": "DH-Interface Received",
          "created_ts": "2020-03-16T23:55:10.781"
         }
