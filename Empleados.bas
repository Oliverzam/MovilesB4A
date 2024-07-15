B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private jsonParser As JSONParser
	Private apiJob As HttpJob
	Public apiURL As String
End Sub

'You can add more parameters here.
Public Sub Initialize  (url As String)
	apiURL = url
End Sub

Public Sub Create(id As Int, Nombre As String, Cargo As String, Salario As Double, Departamento As String) As ResumableSub
	Dim clase As Empleado
	Dim json As String
	Dim data As Map
	
	clase.Initialize()
	json = "{'id':0, 'nombre': '" & Nombre & "', 'cargo': '" & Cargo & "', 'salario': " & Salario & ", 'departamento': '" & Departamento & "'}"

	
	apiJob.Initialize("",Me)
	apiJob.PostString(apiURL, json)
	apiJob.GetRequest.SetContentType("application/json")
	Wait For(apiJob) jobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize( resultado.GetString)
		data = jsonParser.NextObject
		clase.Id = data.Get("id")
		clase.Nombre=data.Get("nombre")
		clase.Cargo=data.Get("cargo")
		clase.Salario=data.Get("salario")
		clase.Departamento=data.Get("departamento")
	End If
	Return clase
End Sub
Public Sub Read_All() As ResumableSub
	Dim c1 As List
	Dim c2 As Empleado
	Dim map As Map
	Dim lista As List
	
	c1.Initialize
	c2.Initialize
	
	apiJob.Initialize("",Me)
	apiJob.Download(apiURL)
	Wait For(apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		lista = jsonParser.NextArray
		For i = 0 To lista.Size - 1
			map = lista.Get(i)
			Dim c2 As Empleado
			c2.Initialize
			c2.Id = map.Get("id")
			c2.Nombre = map.Get("nombre")
			c2.Cargo=map.Get("cargo")
			c2.Salario = map.Get("salario")
			c2.Departamento=map.Get("departamento")
			c1.Add(c2)
		Next
	End If
	
	Return c1
End Sub
Public Sub Read_ById(id As Int) As ResumableSub
	Dim clase As Empleado
	clase.Initialize
	
	apiJob.Initialize("",Me)
	apiJob.Download(apiURL &"/"& id)
	Wait For (apiJob) jobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		Dim map As Map = jsonParser.NextObject
		clase.Id = map.Get("id")
		clase.Nombre = map.Get("nombre")
		clase.Cargo=map.Get("cargo")
		clase.Salario = map.Get("salario")
		clase.Departamento=map.Get("departamento")
	End If
	Return clase
End Sub
Public Sub Update (id As Int, Nombre As String, Cargo As String, Salario As Double, Departamento As String) As ResumableSub
	Dim clase As Empleado
	Dim json As String
	
	clase.Initialize()
	json = "{""id"": " & id & ", ""nombre"": """ & Nombre & """, ""cargo"": """ & Cargo & """, ""salario"": " & Salario & ", ""departamento"": """ & Departamento & """}"
	
	apiJob.Initialize("",Me)
	apiJob.PutString(apiURL & "/" & id, json)
	apiJob.GetRequest.SetContentType("application/json")
	
	Wait For(apiJob) jobDone(resultado As HttpJob)
	Return resultado.Success
End Sub

Public Sub Delete (id As Int) As ResumableSub
	
	apiJob.Initialize("",Me)
	apiJob.Delete(apiURL & "/" & id)
	
	Wait For(apiJob) jobDone(resultado As HttpJob)
	Return resultado.Success
End Sub