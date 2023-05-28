window.onload = function() {

    let x = 5;
    let y = "labas rytas";

    // alert(arParametrasYraTekstas(x));
    arParametrasYraTekstasIsvedimas(x);

    // alert(arParametrasYraTekstas(y));
    arParametrasYraTekstasIsvedimas(y);
}

function arParametrasYraTekstas(a){
    return typeof a
}

function arParametrasYraTekstasIsvedimas(a){
    if (arParametrasYraTekstas(a) === "string") {
        alert("Įvestas tekstas");
    } else {
        alert("Įvestas skaičius");
    }
}