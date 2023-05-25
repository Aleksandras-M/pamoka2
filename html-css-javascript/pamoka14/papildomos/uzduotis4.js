window.onload = function() {

    let x = +prompt("Įveskite metus")
    // alert(x + " metai yra keliamieji: " + arMetaiKeliamieji(x));
    arMetaiKeliamiejiIsvedimas(x);
}

function arMetaiKeliamieji(x) {
    return x % 4 == 0;
}

function arMetaiKeliamiejiIsvedimas(x) {
    if (arMetaiKeliamieji(x) == true) {
        alert(x + "-ieji metai yra keliamieji")
    } else {
        alert(x + "-ieji metai nėra keliamieji")
    }
}