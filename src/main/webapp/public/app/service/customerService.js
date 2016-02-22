angular.module("final-project").service("customerService", ["$http", function($http){

    // Creates a new customer.
    function create(customer) {

        return $http.post("/customer", customer);

    }

    // Gets all customers from the database.
    function getAllCustomers() {

        return $http.get("/customer");

    }

    function getCustomer(id) {

        return $http.get("/customer/" + id);

    }

    function update(customer) {

        return $http.put("/customer", customer);

    }

    // List of available functions.
    return {

        create: create,
        getAllCustomers: getAllCustomers,
        getCustomer: getCustomer,
        update: update

    };

}]);
