
	
	var $table = $('#dataTable')
	
	if($table.length){
		
		var jsonUrl='http://localhost:8080/getAllUser'
		
		$table.DataTable( {
			// data: products,
			pageLength: 5,
			lengthMenu: [3,5,10  ],
			ajax: {
				url: jsonUrl,
				dataSrc: ''
			},
			columns: [
				{
					data: 'name'
				},
				{
					data: 'address'
				},
				{
					data: 'number'
				},
				{
					data: 'email'
				},
				{
					data: 'birthday'
				}
//				{
//					data: 'id',
//					mRender: function(data, type, row){
//						// var str= '<a href="/show/'+data+'/asd>AAA</a>';
//						
//						return '<a href="/home/'+data+'">abdg</a>';
//					}
//				}
			]
		});
	}













