function altaServidor(evento) {
	
	let infoUsuario = new FormData(evento.target);

	fetch("AltaNuevoUsuario", {
		method: "POST",
		body: infoUsuario
	})//12 ACTUALIZO LA INTERFAZ DE USUARIO
		.then(respuesta => {
			console.log ("Registro realizado correctamente");
			
			switch (respuesta.status) {
				case 200:
				console.log("El registro ha ido bien");
					alert ("El registro ha ido bien");
					break;
				case 400:
					
					break;
				case 500:
					
					break;

			}
		})
}
