angular.module("final-project").service("modelService", ["$http", function($http){

    var modelEndPoint = "/model";

    // Gets a list of all current vehicle models.
    function getModels() {

        return $http.get(modelEndPoint);

    }

    // Creates a new vehicle model.
    function newModel(model) {

        return $http.post(modelEndPoint, model);

    }

    // List of available functions.
    return {

        getModels: getModels,
        newModel: newModel

    };

}]);
