window.onload = function() {

    let tekstas = prompt(`Įveskite tekstą`)
    console.log(atrinktiSkaicius(tekstas));
}

function atrinktiSkaicius(tekstas) {
    let atrinktiSkaiciai = "";
  
    for (let i = 0; i < tekstas.length; i++) {
      if ("1234567890".includes(tekstas.at(i))) {
        atrinktiSkaiciai += tekstas.at(i);
      }
    }
  
    return atrinktiSkaiciai;
  }