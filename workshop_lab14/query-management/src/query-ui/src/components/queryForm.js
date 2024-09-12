import { Button, Grid, InputLabel, MenuItem, Select, TextField } from '@mui/material'
import React, { useState } from 'react'
import axios from 'axios';
import dayjs from 'dayjs';
import { DemoContainer } from '@mui/x-date-pickers/internals/demo';
import { LocalizationProvider } from '@mui/x-date-pickers/LocalizationProvider';
import { AdapterDayjs } from '@mui/x-date-pickers/AdapterDayjs';
import { DatePicker } from '@mui/x-date-pickers/DatePicker';

const QueryForm = (props) => {

   
   const inputs = props.inputs;
   const setInputs = props.setInputs;
    const refreshGridData = props.refreshGridData;


    const handleButtonClick = (event) => {
        console.log(JSON.stringify(inputs));
        //alert(JSON.stringify(inputs));

        //send message to server
        axios({
            method: 'post',
            url: 'http://localhost:9999/queries',
            data: inputs
          });
        //reply handle

        refreshGridData();
      
    }

    const handleChange = (event) => {
        // console.log(event.target.name);
        // console.log(event.target.value);

        const name = event.target.name;
        const value = event.target.value;
        setInputs((inputs) => ({ ...inputs, [name]: value }));
    }
    
    return (
        <Grid container spacing={2}>
            
            {false && (
                <Grid item xs={4}><TextField
                    required
                    id="id"
                    label="id"
                    defaultValue=""
                    name="id"
                    value={inputs.id}
                    onChange={handleChange}

                /> </Grid>)}
           
            <Grid item xs={4}>
                <TextField
                    required
                    id="name"
                    label="name"
                    defaultValue=""
                    name="name"
                    value={inputs.name}
                    onChange={handleChange}

                />
            </Grid>
            <Grid item xs={4}>
                <TextField
                    required
                    id="mobile"
                    label="mobile"
                    defaultValue=""
                    name="mobile"
                    value={inputs.mobile}
                    onChange={handleChange}

                />
            </Grid>
            <Grid item xs={4}>
                <TextField
                    required
                    id="emailId"
                    label="emailId"
                    defaultValue=""
                    name="emailId"
                    value={inputs.emailId}
                    onChange={handleChange}

                />
            </Grid>
            <Grid item xs={4}>
                <TextField
                    required
                    id="description"
                    label="Query description"
                    defaultValue=""
                    name="description"
                    value={!!inputs.description?inputs.description:''}
                    onChange={handleChange}

                />
            </Grid>
            <Grid item xs={4}>
                <TextField
                    // required
                    id="response"
                    label="response"
                    defaultValue=""
                    name="response"
                    value={!!inputs.response?inputs.response:''}
                    onChange={handleChange}

                />
            </Grid>
            
            <Grid item xs={4}>
                {/* <TextField
                    //required
                    id="status"
                    label="status"
                    defaultValue="open"
                    name="status"
                    value={inputs.status}
                    onChange={handleChange}

                />
            </Grid>
            <Grid item xs={4}> */}
                <Select
                    id='status'
                    name="status"
                    value={inputs.status}
                    label="Status"
                    onChange={handleChange}
                    sx={{ m: 1, minWidth: 220 }}
                    >
                    <MenuItem value={'OPEN'}>OPEN</MenuItem>
                    <MenuItem value={'INPROGRESS'}>INPROGRESS</MenuItem>
                    <MenuItem value={'ARCHIVED'}>ARCHIVED</MenuItem>
                    <MenuItem value={'CLOSED'}>CLOSED</MenuItem>
                </Select>
            </Grid>
            {/* <Grid item xs={4}>
                <LocalizationProvider dateAdapter={AdapterDayjs}>
                    <DemoContainer components={['DatePicker', 'DatePicker']}>
                        <DatePicker
                        label="Query date"
                        value={inputs.queryDate}
                        onChange={handleChange}
                        name='queryDate'
                        id='queryDate'
                        />
                    </DemoContainer>
                    </LocalizationProvider>
            </Grid> */}
            <Grid item xs={4}>
                <Button variant="contained" onClick={handleButtonClick}>Submit</Button>
            </Grid>
        </Grid>
    )
}

export default QueryForm