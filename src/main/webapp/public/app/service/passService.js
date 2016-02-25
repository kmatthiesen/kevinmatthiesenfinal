angular.module("final-project").service("passService", ["$http", function($http){

    var passEndPoint = "/pass";

    function create(pass) {

        return $http.post(passEndPoint, pass);

    }

    function getAllPasses() {

        return $http.get(passEndPoint);

    }

    function getPass(id) {

        return $http.get(passEndPoint + "/" + id);

    }

    function update(pass) {

        return $http.put(passEndPoint, pass);

    }

    function deletePass(id) {

        return $http.delete(passEndPoint + "/" + id);

    }

    // List of available functions.
    return {

        create: create,
        getAllPasses:getAllPasses,
        getPass: getPass,
        update: update,
        deletePass: deletePass

    };

}]);
