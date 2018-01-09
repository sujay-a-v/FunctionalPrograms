$('document').ready(function() {
	});
	
	function forget(){
		$.ajax({
			url : 'ForgetPW',
			type : 'post',
			data : {
				email : $("#email").val(),
			},
			success : function(data) {
				
				/*$('#password').val(data),*/
				$('#myModal').modal('hide');
				/*$('#myModal1').html(data).modal('show');*/
				alert("Your password is \n \n"+data);
			
			}
			
		});
	}