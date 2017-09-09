/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Javascript request til server
var url = "api/pers/p";
var conn = {method: "get"};
var prom = fetch(url, conn);

prom.then(function (response) {
    return response.json();
}).then(function (data) {
    alert(data.STATUS);
});



//Send Ajax request til server
var xhttp = new XMLHttpRequest();
xhttp.onreadystatechange = function(){
    if (this.readyState == 4 && this.status == 200) {
        alert(this.responseText);
    }
};
xhttp.open("GET", "api/pers/p", true);
xhttp.send();
//alert("Dette er hallo from HTML");
