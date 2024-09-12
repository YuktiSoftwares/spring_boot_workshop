import React, { useState } from 'react'
import axios from 'axios';
import Box from '@mui/material/Box';
import {useEffect} from 'react';
import { DataGrid, GridColDef } from '@mui/x-data-grid';
const columns = [
    { field: 'id', headerName: 'ID', width: 90 }
    , {
      field: 'status',
      headerName: 'Status',
      width: 150,
      editable: true,
    },{
      field: 'name',
      headerName: 'Name',
      width: 150,
      editable: true,
    },
    {
      field: 'mobile',
      headerName: 'Mobile',
      width: 150,
      editable: true,
    },
    {
      field: 'email',
      headerName: 'Email',
      width: 150,
      editable: true,
    }, {
      field: 'description',
      headerName: 'Query Descrition',
      width: 250,
      editable: true,
    }, {
      field: 'response',
      headerName: 'Response',
      width: 250,
      editable: true,
    },
    
  ];
  
 

  const initialRows = [];

const QueryGrid = (props) => {
  
  const inputs = props.inputs;
  const setInputs = props.setInputs;
  let refreshGrid=props.refreshGrid;

  const fetchTableData = ()=>{
    axios.get('http://localhost:9999/queries')
    .then((result) => 
      //alert(JSON.stringify(result.data))
      setRows(result.data)
  )
    .catch(error => console.log(error));
  }
  const [rows, setRows] = useState(initialRows);
  useEffect(fetchTableData,[refreshGrid]);
  const initialInputs1 = {
    id: '1111s',
    name: '',
    mobile: '',
    email: '',
    query: '',
    reply: '',
    status: ''
}

  const handleRowDoubleClick = (params, event, details)=>{
      console.log(params.row);
      console.log(inputs);
      console.log(setInputs);


      //setInputs({...inputs, id:params.row.id, name:params.row.name});
      console.log("after change:", inputs);
      setInputs((inputs) => ({ ...inputs, 
        'id': params.row.id ,
        'name': params.row.name ,
        'mobile': params.row.mobile ,
        'description': params.row.description ,
        'response': params.row.response ,
        'email': params.row.email ,
        'reply': params.row.reply ,
        'status': params.row.status ,
      }));
  }

  return (
    <Box sx={{ height: 400, width: '100%' }}>
    <DataGrid
      rows={rows}
      columns={columns}
      initialState={{
        pagination: {
          paginationModel: {
            pageSize: 5,
          },
        },
      }}
      pageSizeOptions={[5]}
      checkboxSelection
      disableRowSelectionOnClick
      onRowDoubleClick={handleRowDoubleClick}
    />
  </Box>
  )
}

export default QueryGrid