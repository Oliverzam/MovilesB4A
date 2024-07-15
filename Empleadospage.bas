B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtCargo As EditText
	Private txtSalario As EditText
	Private txtDepartameto As EditText
	Private apiClas As Empleados
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("empleados")
	apiClas.Initialize("https://utncloudapi20240714160641.azurewebsites.net/api/Empleados")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnLeer_Click
	Wait For (apiClas.Read_ById(txtId.Text)) Complete (r As Empleado)
	If r.Id > 0 Then
		txtId.Text=r.Id
		txtNombre.Text = r.Nombre
		txtCargo.Text=r.Cargo
		txtSalario.Text=r.Salario
		txtDepartameto.Text=r.Departamento
		Msgbox("Registro Encontrado con éxito", "OK")
	Else
		Msgbox("No hay datos","Error")
	End If
End Sub

Private Sub btnInsertar_Click
	Wait For (apiClas.Create(0,txtNombre.Text,txtCargo.Text,txtSalario.Text,txtDepartameto.Text)) Complete (c As Empleado)
	If c.Id> 0 Then
		txtId.Text = c.Id
		Msgbox("Registro Creado", "OK")
	Else
		Msgbox("No se pudo crear el registro","OK")
	End If
End Sub

Private Sub btnEliminar_Click
	Wait For (apiClas.Delete(txtId.Text)) Complete (r As Boolean)
	If r = True Then
		Msgbox("Registro Eliminado", "OK")
		txtId.Text=""
		txtNombre.Text = ""
		txtCargo.Text=""
		txtSalario.Text=""
		txtDepartameto.Text=""
	Else
		Msgbox("No hay datos","Error")
	End If
End Sub

Private Sub btnActualizar_Click
	Wait For (apiClas.Update(txtId.Text,txtNombre.Text,txtCargo.Text,txtSalario.Text,txtDepartameto.Text)) Complete (r As Boolean)
	If r = True Then
		Msgbox("Registro Actualizado", "OK")
	Else
		Msgbox("No hay datos","Error")
	End If
End Sub




Private Sub btnMenu_Click
	B4XPages.ShowPage("MainPage")
End Sub
