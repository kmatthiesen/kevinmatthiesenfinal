angular.module("final-project").service("passService", ["$http", function($http){

    var passEndPoint = "/pass";

    function create(pass) {

        return $http.post(passEndPoint, pass);

    }

    function getAllPasses() {

        return $http.get(passEndPoint);

    }

    // List of available functions.
    return {

        create: create,
        getAllPasses:getAllPasses

    };

}]);
