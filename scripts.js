//configure data label, type, and value
function abstract_action(element) {
    var dataLabel = element.id;
    var dataObjects = document.getElementById(dataLabel).value;
    var data_container = { dataObjects }
    var converter = JSON.stringify(data_container);
    data_bus(dataLabel, converter);
}

//interaction between JavaScript and python file
function data_bus(dataLabel, converter) {

    //If no data in converter, get Data user entered
    if (!converter) {
        $.ajax({
            url: "",
            type: "GET",
            contentType: dataLabel,
            data: JSON.stringify(converter)
        });
    } else {

        //Else send Data to user
        $.ajax({
            url: "",
            type: "POST",
            contentType: dataLabel,
            data: JSON.stringify(converter)
        });

    }

}