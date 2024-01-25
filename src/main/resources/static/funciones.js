function eliminar(id){

	Swal.fire({
		title: 'Are you sure?',
		text: "You won't be able to revert this!",
		icon: 'warning',
		showCancelButton: true,
		confirmButtonColor: '#3085d6',
		cancelButtonColor: '#d33',
		confirmButtonText: 'Yes, delete it!'
	}).then((ok) => {
		if (ok.isConfirmed) {
			$.ajax({
				url:"/eliminar/" + id,
				success: function(res){
					console.log(res);
				}
			});
			
			Swal.fire(
				'Deleted!',
				'Your file has been deleted.',
				'success'
			).then(()=>{
				if(ok){
					location.href="/listar";
				}
			})
		}
	})

}