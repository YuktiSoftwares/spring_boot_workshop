import React, { useEffect, useState } from 'react'
import { Box, Button, Grid, TextField } from '@mui/material'
import QueryForm from './queryForm'
import QueryGrid from './queryGrid'
import dayjs from 'dayjs'

const Body = () => {

  const initialInputs = {
    id: '',
    name: '',
    mobile: '',
    email: '',
    query: '',
    queryDate:dayjs(new Date()),
    reply: '',
    status: 'OPEN'
}

  const [inputs, setInputs] = useState(initialInputs);
  const [refreshGrid, setRefreshGrid] = useState(false);


  const refreshGridData = ()=>{
    setRefreshGrid(!refreshGrid);
  }
  return (

    <Box sx={{
      minHeight: '80vh',
      height: '100%',
      background: '#f2f7f6',
      overflow: 'auto',
      flex: 1,
      padding: '10px'

    }}>
      <Grid container spacing={2}>
          <Grid item xs={12}>
             <QueryForm inputs={inputs} setInputs={setInputs} refreshGridData={refreshGridData}/>
          </Grid>         
      </Grid>
      <Grid container spacing={2}>       
          <Grid item xs={12}>
              <QueryGrid  inputs={inputs} setInputs={setInputs} refreshGrid={refreshGrid}/>
          </Grid>
      </Grid>
    </Box>

  )
}

export default Body