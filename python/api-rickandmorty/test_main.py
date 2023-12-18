import unittest
from unittest.mock import patch, Mock
import main  # import your main script

class TestMain(unittest.TestCase):
    @patch('main.requests.get')
    def test_get_request(self, mock_get):
        # Mock the response from the API
        mock_resp = Mock()
        mock_resp.json.return_value = {
            'status': 'Alive',
            'name': 'Rick Sanchez'
        }
        mock_get.return_value = mock_resp

        # Call the function
        main.get_request()

        # Assert that the API was called 11 times
        self.assertEqual(mock_get.call_count, 11)

        # Assert that the API was called with the correct URLs
        for i in range(1, 11):
            mock_get.assert_any_call('https://rickandmortyapi.com/api/character/' + format(i))

    
    @patch('main.requests.get')
    def test_get_request_episode(self, mock_get):
        # Mock the response from the API
        mock_resp = Mock()
        mock_resp.json.return_value = {
            'name': 'Pilot'
        }
        mock_get.return_value = mock_resp

        # Call the function
        main.get_request_episode()

        # Assert that the API was called 21 times
        self.assertEqual(mock_get.call_count, 21)

        # Assert that the API was called with the correct URLs
        for i in range(1, 21):
            mock_get.assert_any_call('https://rickandmortyapi.com/api/episode/' + format(i))

if __name__ == '__main__':
    unittest.main()