
function iniciarSesion(){
    const usuario       = document.getElementById('correo').value;
    const contrasenia   = document.getElementById('password').value;
    const errorMessage  = document.getElementById('error-message');
  
    if(usuario == 'admin' || contrasenia == 'admin'  || contrasenia == '1234'){
      document.getElementById('correo').classList.add('is-invalid');
      document.getElementById('password').classList.add('is-invalid');
      errorMessage.classList.add('invalid-feedback'); // Agrega la clase invalid-feedback al elemento div
      errorMessage.innerHTML = 'Debe ingresar un correo electrónico y una contraseña válidos.';
      return false;
    }
  
    document.getElementById('correo').classList.remove('is-invalid');
    document.getElementById('password').classList.remove('is-invalid');
    errorMessage.innerHTML = '';
  
    return true;
  }
  

document.getElementById('formInciar').addEventListener('submit', function(e) {
    if (!iniciarSesion()) {
      e.preventDefault();
    }
});

