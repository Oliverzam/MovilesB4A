B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private btnEmpleados As Button
	Private btnProyectos As Button
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


Private Sub btnEmpleados_Click
	Dim PageEmpleados As Empleadospage
	PageEmpleados.Initialize
    
	B4XPages.AddPageAndCreate("PageEmpleados", PageEmpleados)
	B4XPages.ShowPage("PageEmpleados")
End Sub

Private Sub btnProyectos_Click
	Dim PageProyectos As Proyectospage
	PageProyectos.Initialize
    
	B4XPages.AddPageAndCreate("PageProyectos", PageProyectos)
	B4XPages.ShowPage("PageProyectos")

End Sub