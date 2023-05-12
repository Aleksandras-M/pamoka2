window.onload = function() {

    let n = +prompt(`Įveskite raidės skaičių`);
    let zodis = prompt(`Įveskite žodį`); 
    alert(`${n}-oji raidė žodyje ${zodis} yra ${rastiZodzioRaide(n, zodis)}`)
}


function rastiZodzioRaide(n, zodis) {
    if (n >= 0 && n < zodis.length) { 
      return zodis[n - 1];
    } else if (n < 0 && Math.abs(n) <= zodis.length) { 
      return zodis[zodis.length + n];
    } else { 
      return "";
    }
  }