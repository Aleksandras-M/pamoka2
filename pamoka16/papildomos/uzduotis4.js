window.onload = function() {

    let n = +prompt(`Įveskite skaičių kurio faktorialą norite surasti`)
    console.log(faktorialas(n));
}

function faktorialas(n) {
    
    let faktorialas = 1;

    for(let i = 1; i <= n; i++){
        faktorialas *= i;
    }

    return faktorialas;
}