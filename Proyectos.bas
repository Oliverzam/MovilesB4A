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
Public Sub Initialize(url As String)
	apiURL = url
End Sub

Public Sub Create(Id As Int, Nombre_Proyecto As String, Horas_Asignadas As Int, Fecha_Asignacion As Long, EmpleadosId As Int) As ResumableSub
	Dim clase As Proyecto
	Dim json As String
	Dim data As Map
    
	clase.Initialize()
	json = "{""id"":0, ""nombre_Proyecto"": """ & Nombre_Proyecto & """, ""horas_Asignadas"": " & Horas_Asignadas & ", ""fecha_Asignacion"": " & Fecha_Asignacion & ", ""empleadosId"": " & EmpleadosId & "}"
    
	apiJob.Initialize("", Me)
	apiJob.PostString(apiURL, json)
	apiJob.GetRequest.SetContentType("application/json")
	Wait For(apiJob) jobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		data = jsonParser.NextObject
		clase.Id = data.Get("id")
		clase.Nombre_Proyecto = data.Get("nombre_Proyecto")
		clase.Horas_Asignadas = data.Get("horas_Asignadas")
		clase.Fecha_Asignacion = data.Get("fecha_Asignacion")
		clase.EmpleadosId = data.Get("empleadosId")
	End If
	Return clase
End Sub

Public Sub Read_ById(Id As Int) As ResumableSub
	Dim clase As Proyecto
	clase.Initialize()
    
	apiJob.Initialize("", Me)
	apiJob.Download(apiURL & "/" & Id)
	Wait For(apiJob) jobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		Dim map As Map = jsonParser.NextObject
		clase.Id = map.Get("id")
		clase.Nombre_Proyecto = map.Get("nombre_Proyecto")
		clase.Horas_Asignadas = map.Get("horas_Asignadas")
		clase.EmpleadosId = map.Get("empleadosId")
	End If
	Return clase
End Sub

Public Sub Update(Id As Int, Nombre_Proyecto As String, Horas_Asignadas As Int, Fecha_Asignacion As Long, EmpleadosId As Int) As ResumableSub
	Dim clase As Proyecto
	Dim json As String
	clase.Initialize()
	json = "{""Id"": " & Id & ", ""Nombre_Proyecto"": """ & Nombre_Proyecto & """, ""Horas_Asignadas"": " & Horas_Asignadas & ", ""Fecha_Asignacion"": " & Fecha_Asignacion & ", ""EmpleadosId"": " & EmpleadosId & "}"
    
	apiJob.Initialize("", Me)
	apiJob.PutString(apiURL & "/" & Id, json)
	apiJob.GetRequest.SetContentType("application/json")
    
	Wait For(apiJob) jobDone(resultado As HttpJob)
	Return resultado.Success
End Sub

Public Sub Delete(Id As Int) As ResumableSub
	apiJob.Initialize("", Me)
	apiJob.Delete(apiURL & "/" & Id)
    
	Wait For(apiJob) jobDone(resultado As HttpJob)
	Return resultado.Success
End Sub
