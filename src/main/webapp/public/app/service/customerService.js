angular.module("final-project").service("customerService", ["$http", function($http){

    // Creates a new customer.
    function create(customer) {

        return $http.post("/customer", customer);

    }

    // Gets all customers from the database.
    function getAllCustomers() {

        return $http.get("/customer");

    }

    // List of available functions.
    return {

        create: create,
        getAllCustomers: getAllCustomers

    };

}]);
