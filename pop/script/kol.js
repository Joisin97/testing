document.addEventListener('DOMContentLoaded', function () {
    const loginForm = document.getElementById('loginForm');
  
    
    let tanggal = new Date();
    document.getElementById("date").innerHTML = tanggal;
    
    loginForm.addEventListener('submit', function (event) {
        event.preventDefault();
  
        const username = document.getElementById('username').value;
        const password = document.getElementById('password').value;
  
        if (username === 'admin' && password === 'admin123') {
            alert('Login berhasil!');
        } else {
            alert('Login gagal. Silakan coba lagi.');
        }
    });
  });
  