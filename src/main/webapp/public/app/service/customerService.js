angular.module("final-project").service("customerService", ["$http", function($http){

    var customerEndPoint = "/customer";

    // Creates a new customer.
    function create(customer) {

        return $http.post(customerEndPoint, customer);

    }

    // Gets all customers from the database.
    function getAllCustomers() {

        return $http.get(customerEndPoint);

    }

    // Get a customer from the database by their id.
    function getCustomer(id) {

        return $http.get(customerEndPoint + "/" + id);

    }

    // Update a customer in the database.
    function update(customer) {

        return $http.put(customerEndPoint, customer);

    }

    // List of available functions.
    return {

        create: create,
        getAllCustomers: getAllCustomers,
        getCustomer: getCustomer,
        update: update

    };

}]);
