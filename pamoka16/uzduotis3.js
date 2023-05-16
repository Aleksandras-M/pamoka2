window.onload = function() {

    let zodis = prompt(`Įveskite žodį`);
    let n = +prompt(`įveskite kiek kartų išvesti žodį "${zodis}"`);
    zodzioIsvedimas(zodis, n);

}

function zodzioIsvedimas(zodis, n) {
    for(let i = 0; i < n; i++) {
        console.log(zodis);
    }
}